package classroom.repository;

import classroom.entity.TestQuestionMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestQuestionMappingRepository extends JpaRepository<TestQuestionMapping, Integer> {
}
