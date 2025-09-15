package classroom.repository;

import classroom.entity.Mcq;
import org.springframework.data.jpa.repository.JpaRepository;

public interface McqRepository extends JpaRepository<Mcq, Integer> {
}
