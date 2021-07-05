package ws.prospeak.personal.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.prospeak.personal.api.model.Todo;
import ws.prospeak.personal.api.repository.TodoRepo;

@Service
public class TodoService {
  @Autowired
  private TodoRepo repo;

  public List<Todo> getTodos() {
    return repo.findAll();
  }

  public Optional<Todo> findTodo(int todoID) {
    return repo.findById(todoID);
  }

  public Todo addTodo(Todo todo) {
    return repo.save(todo);
  }

  public Todo remindTodo(int todoID) {
    Todo entity = findTodo(todoID).orElse(null);
    if (entity != null) {
      entity.setReminder(!entity.isReminder());
      return repo.save(entity);
    } else {
      return null;
    }
  }
}
