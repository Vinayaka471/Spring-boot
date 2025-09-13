package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_subject_mapping")
public class UserSubjectMapping {
    @Id
    @Column(name = "user_subject_id")
    private Integer userSubjectId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    // getters and setters
    public Integer getUserSubjectId() { return userSubjectId; }
    public void setUserSubjectId(Integer userSubjectId) { this.userSubjectId = userSubjectId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }
}
