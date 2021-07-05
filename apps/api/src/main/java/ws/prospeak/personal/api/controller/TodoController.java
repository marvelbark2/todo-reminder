package ws.prospeak.personal.api.controller;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ws.prospeak.personal.api.model.Todo;
import ws.prospeak.personal.api.service.TodoService;

@Controller

@RequestMapping("/api/todo")
public class TodoController {
  @Autowired
  private TodoService service;

  @GetMapping()
  public ResponseEntity<List<Todo>> todoList() {
    return ResponseEntity.ok(service.getTodos());
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
    return ResponseEntity.ok(service.addTodo(todo));
  }

  @PostMapping("/reminder")
  public ResponseEntity<Todo> updateReminder(@RequestBody JsonNode node) {
    return ResponseEntity.ok(service.remindTodo(node.get("todo_id").asInt()));
  }

}
