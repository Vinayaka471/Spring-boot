package classroom.repository;

import classroom.entity.UserRolesMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesMappingRepository extends JpaRepository<UserRolesMapping, Integer> {
}
