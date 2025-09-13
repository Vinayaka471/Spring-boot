package classroom.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "test_question_mapping")
public class TestQuestionMapping {
    @Id
    @Column(name = "test_question_mapping_id")
    private Integer testQuestionMappingId;

    @ManyToOne
    @JoinColumn(name = "test_id", nullable = false)
    private McqTest test;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Mcq question;

    // getters and setters
    public Integer getTestQuestionMappingId() { return testQuestionMappingId; }
    public void setTestQuestionMappingId(Integer testQuestionMappingId) { this.testQuestionMappingId = testQuestionMappingId; }

    public McqTest getTest() { return test; }
    public void setTest(McqTest test) { this.test = test; }

    public Mcq getQuestion() { return question; }
    public void setQuestion(Mcq question) { this.question = question; }
}
