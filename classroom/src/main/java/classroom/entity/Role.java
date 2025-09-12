package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name", unique = true, nullable = false)
    private String roleName;

    @Column(name = "role_description")
    private String roleDescription;

    // getters and setters
    public Integer getRoleId() { return roleId; }
    public void setRoleId(Integer roleId) { this.roleId = roleId; }

    public String getRoleName() { return roleName; }
    public void setRoleName(String roleName) { this.roleName = roleName; }

    public String getRoleDescription() { return roleDescription; }
    public void setRoleDescription(String roleDescription) { this.roleDescription = roleDescription; }
}
