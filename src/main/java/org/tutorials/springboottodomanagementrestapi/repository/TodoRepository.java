package org.tutorials.springboottodomanagementrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tutorials.springboottodomanagementrestapi.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
