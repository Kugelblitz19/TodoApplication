import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task>tasks;
    public TodoList(){
        tasks=new ArrayList<>();
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(int index){
        if (index>=0 && index<tasks.size()){
            tasks.remove(index);
        }else {
            System.out.println("Invalid index. Task not removed.");
        }
    }
    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("Todo list is empty.");
        }else {
            System.out.println("Todo List:");
            for (int i=0;i<tasks.size();i++){
                Task task=tasks.get(i);
                String status=task.isCompleted() ? "Completed" : "Not Completed";
                System.out.println((i+1) + ". " + task.getName() + " - Due Date: " + task.getDueDate()
                + " - Status: " + status);
            }
        }
    }
}
