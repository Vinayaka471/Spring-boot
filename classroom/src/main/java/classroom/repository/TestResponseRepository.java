package classroom.repository;

import classroom.entity.TestResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResponseRepository extends JpaRepository<TestResponse, Integer> {
}
