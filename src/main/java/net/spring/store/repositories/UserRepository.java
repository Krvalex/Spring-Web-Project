package net.spring.store.repositories;

import net.spring.store.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    abstract User findByEmail(String email);
}
