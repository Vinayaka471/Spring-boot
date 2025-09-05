package classroom;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final DataSource dataSource;

    public SecurityConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    // 🔹 Tell Spring Security to fetch users & roles from pgdb
    @Bean
    public UserDetailsService userDetailsService() {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);

        // Fetch users (username, password, enabled)
        manager.setUsersByUsernameQuery(
            "SELECT username, userpassword, true as enabled FROM users WHERE username=?"
        );

        // Fetch roles (username, role_name)
        manager.setAuthoritiesByUsernameQuery(
            "SELECT u.username, r.role_name " +
            "FROM users u " +
            "JOIN user_role_mapping urm ON u.id = urm.user_id " +
            "JOIN roles r ON urm.role_id = r.id " +
            "WHERE u.username=?"
        );

        return manager;
    }

    // 🔹 Password encoder (NoOp since you are using {noop}passwords)
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    // 🔹 Security filter chain
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        String[] allowedPaths = { "/", "/WEB-INF/views/**", "/static/**", "/css/**", "/js/**", "/images/**" };

        httpSecurity.csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(allowedPaths).permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/")  // custom login page
                .loginProcessingUrl("/login") // form action
                .usernameParameter("userEmail") // must match JSP input name
                .passwordParameter("userPassword")
                .defaultSuccessUrl("/welcome", true)
                .failureUrl("/?error")
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .permitAll()
            );

        return httpSecurity.build();
    }
}
