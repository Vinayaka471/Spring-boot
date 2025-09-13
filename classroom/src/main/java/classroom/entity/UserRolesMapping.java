package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles_mapping")
public class UserRolesMapping {
    @Id
    @Column(name = "user_role_id")
    private Integer userRoleId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    // getters and setters
    public Integer getUserRoleId() { return userRoleId; }
    public void setUserRoleId(Integer userRoleId) { this.userRoleId = userRoleId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}
