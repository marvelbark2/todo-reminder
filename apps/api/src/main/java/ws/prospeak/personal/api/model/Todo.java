package ws.prospeak.personal.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "todo_id_seq")
  private int id;

  @Column
  private String title;

  @Column
  private String day;

  @Column
  private boolean reminder;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public boolean isReminder() {
    return reminder;
  }

  public void setReminder(boolean reminder) {
    this.reminder = reminder;
  }

}
