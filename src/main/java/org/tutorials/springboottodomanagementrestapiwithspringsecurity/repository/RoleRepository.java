package org.tutorials.springboottodomanagementrestapiwithspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springboottodomanagementrestapiwithspringsecurity.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
