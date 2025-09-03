package classroom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		String[] allowedPaths = { "/", "/WEB-INF/views/**", "/static/**", "/css/**", "/js/**", "/images/**" };

		httpSecurity.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(
						authorize -> authorize.requestMatchers(allowedPaths).permitAll().anyRequest().authenticated())
				.formLogin(form -> form.loginPage("/").loginProcessingUrl("/login").usernameParameter("userEmail")
						.passwordParameter("userPassword").defaultSuccessUrl("/welcome", true).failureUrl("/?error")
						.permitAll())
				.logout(logout -> logout.logoutUrl("/logout").logoutSuccessUrl("/").invalidateHttpSession(true)
						.clearAuthentication(true).permitAll());

		return httpSecurity.build();
	}
}
