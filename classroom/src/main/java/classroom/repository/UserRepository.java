package classroom.repository;

import classroom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    // Spring Data JPA will automatically generate this query:
    Optional<User> findByUsername(String username);
}
