package org.tutorials.springboottodomanagementrestapiwithspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springboottodomanagementrestapiwithspringsecurity.entity.User;

import java.util.Optional;

public interface UserRepsository extends JpaRepository<User, Long> {
    Optional<User> findByusername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);
}
