import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks;

    // Constructor
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    // Method to add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    public void editTask(Task oldTask, Task newTask) {
        int index = tasks.indexOf(oldTask);
        if (index != -1) {
            tasks.set(index, newTask);
        }
    }

    public void completeTask(Task task) {
        task.setStatus("Completed");
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
