package org.tutorials.springboottodomanagementrestapiwithspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springboottodomanagementrestapiwithspringsecurity.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
