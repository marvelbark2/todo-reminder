package ws.prospeak.personal.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ws.prospeak.personal.api.model.Todo;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {

}
