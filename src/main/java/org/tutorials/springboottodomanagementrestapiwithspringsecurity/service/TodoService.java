package org.tutorials.springboottodomanagementrestapiwithspringsecurity.service;

import org.tutorials.springboottodomanagementrestapiwithspringsecurity.dto.TodoDto;

import java.util.List;

public interface TodoService {
    TodoDto addTodo(TodoDto todoDto);
    TodoDto getTodoById(Long id);
    List<TodoDto> getAllTodos();
    TodoDto updateTodo(Long id, TodoDto todoDto);
    void deleteTodoById(Long id);
    TodoDto completeTodo(Long id);
    TodoDto uncompletedTodo(Long id);
}
