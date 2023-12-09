package app.service.ERP.repositories;

import app.service.ERP.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    Optional<User> findByUsernameOrEmail(String username, String email);
    User findById(int id);
}
