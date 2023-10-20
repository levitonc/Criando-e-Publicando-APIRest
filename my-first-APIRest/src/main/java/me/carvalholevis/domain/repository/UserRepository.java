package me.carvalholevis.domain.repository;

import me.carvalholevis.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public abstract boolean existsByAccountNumber(String accountNumber);

}
