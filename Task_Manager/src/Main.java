import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Assignment", "Finish by Friday", "2024-02-10", "Pending");
        Task task2 = new Task("Read Java Book", "Chapter 3", "2024-02-15", "Pending");
        Task task3 = new Task("Java Code","startUp","2024-01-31","Completed");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.editTask(task2,task3);
        taskManager.deleteTask(task1);
        ArrayList<Task> tasks = taskManager.getTasks();
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTitle() + ", Due Date: " + task.getDueDate() + ", Status: " + task.getStatus());
        }
    }
}
