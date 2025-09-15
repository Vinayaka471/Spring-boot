package classroom.repository;

import classroom.entity.UserSubjectMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSubjectMappingRepository extends JpaRepository<UserSubjectMapping, Integer> {
}
