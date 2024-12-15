package group3.group3_assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import group3.group3_assignment.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findById(Long id);

    List<User> findAll();
}
