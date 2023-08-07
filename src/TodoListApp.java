import javax.print.attribute.standard.DateTimeAtCompleted;
import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class TodoListApp {
    private TodoList todoList;
    private Scanner scanner;
    public TodoListApp(){
        todoList =new TodoList();
        scanner=new Scanner(System.in);

    }
    public void start(){
        boolean isRunning = true;
        while (isRunning){
            displayMenu();
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:isRunning =false;
                break;
                default:
                    System.out.println("Invalid choice.Please try again.");
            }
        }
    }
    private void displayMenu(){
        System.out.println("\nTodo List Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task.");
        System.out.println("3. Display Tasks.");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }
    private void addTask(){
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Enter due date(yyyy-mm-dd) [optional] : ");
        String dueDateString = scanner.nextLine();
        LocalDate dueDate=null;
        if (!dueDateString.isEmpty()){
            try{
                dueDate =LocalDate.parse(dueDateString);

            }catch (DateTimeException e){
                System.out.println("Invalid date format.Task not added.");
                return;
            }
        }
        Task task=new Task(name,dueDate,false);
        todoList.addTask(task);
        System.out.println("Task added successfully.");
    }
    private void removeTask(){
        System.out.print("Enter the task number to remove: ");
        int taskNumber =scanner.nextInt();
        scanner.nextLine();
        todoList.removeTask(taskNumber=1);
        System.out.println("Task Removed Successfully.");
    }
    private void displayTasks(){
        todoList.displayTasks();
    }
}
