import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate dueDate;
    private boolean isCompleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Task(String name, LocalDate dueDate, boolean isCompleted){
        this.name=name;
        this.dueDate=dueDate;
        this.isCompleted=isCompleted;

    }
}
