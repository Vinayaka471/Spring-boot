package classroom.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_email", unique = true, nullable = false)
    private String userEmail;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_roles_mapping",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    // getters and setters
    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    public String getUserPassword() { return userPassword; }
    public void setUserPassword(String userPassword) { this.userPassword = userPassword; }

    public Set<Role> getRoles() { return roles; }
    public void setRoles(Set<Role> roles) { this.roles = roles; }
}
