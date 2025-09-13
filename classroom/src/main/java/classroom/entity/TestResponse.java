package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "test_response")
public class TestResponse {
    @Id
    @Column(name = "test_response_id")
    private Integer testResponseId;

    @ManyToOne
    @JoinColumn(name = "test_id", nullable = false)
    private McqTest test;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Mcq question;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "response")
    private String response;

    // getters and setters
    public Integer getTestResponseId() { return testResponseId; }
    public void setTestResponseId(Integer testResponseId) { this.testResponseId = testResponseId; }

    public McqTest getTest() { return test; }
    public void setTest(McqTest test) { this.test = test; }

    public Mcq getQuestion() { return question; }
    public void setQuestion(Mcq question) { this.question = question; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getResponse() { return response; }
    public void setResponse(String response) { this.response = response; }
}
