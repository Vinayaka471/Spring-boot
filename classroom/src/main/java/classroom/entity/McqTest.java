package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mcq_test")
public class McqTest {
    @Id
    @Column(name = "test_id")
    private Integer testId;

    @Column(name = "test_name", nullable = false, length = 100)
    private String testName;

    @Column(name = "test_link", nullable = false, unique = true, length = 255)
    private String testLink;

    // getters and setters
    public Integer getTestId() { return testId; }
    public void setTestId(Integer testId) { this.testId = testId; }

    public String getTestName() { return testName; }
    public void setTestName(String testName) { this.testName = testName; }

    public String getTestLink() { return testLink; }
    public void setTestLink(String testLink) { this.testLink = testLink; }
}
