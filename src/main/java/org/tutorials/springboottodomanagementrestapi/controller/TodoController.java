package org.tutorials.springboottodomanagementrestapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tutorials.springboottodomanagementrestapi.dto.TodoDto;
import org.tutorials.springboottodomanagementrestapi.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    @PostMapping("/create")
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){
        TodoDto todo = todoService.addTodo(todoDto);
        return new ResponseEntity<>(todo, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable Long id){
        TodoDto todo = todoService.getTodoById(id);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping("/lists")
    public ResponseEntity<List<TodoDto>> getAllTodos(){
        List<TodoDto> todos = todoService.getAllTodos();
//        return new ResponseEntity<>(todos, HttpStatus.OK);
        return ResponseEntity.ok(todos); // it is short
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<TodoDto> updateTodo(@PathVariable Long id, @RequestBody TodoDto todoDto){
        TodoDto todo = todoService.updateTodo(id, todoDto);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteTodo(@PathVariable Long id){
        todoService.deleteTodoById(id);
        return ResponseEntity.ok("Todo deleted successfully");
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<TodoDto> completeTodo(@PathVariable Long id){
        TodoDto todo = todoService.completeTodo(id);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @PatchMapping("/{id}/uncompleted")
    public ResponseEntity<TodoDto> uncompletedTodo(@PathVariable Long id){
        TodoDto todo = todoService.uncompletedTodo(id);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }
}
