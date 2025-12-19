package Logic;

import java.util.ArrayList;
import java.util.List;

// TaskManger
// ----------
// Central controller of the application.
// Manages tasks, users, and observers.
// Implements Singleton and Observer patterns.

public class TaskManger {

    private static TaskManger instance;

    // Stores all created tasks in the system
    private List<Task> tasks;

    private List<User> users;

    // List of observers (users) that receive notifications
    private List<TaskObserver> observers;

    private TaskManger() {
        tasks = new ArrayList<>();
        users = new ArrayList<>();
        observers = new ArrayList<>();
    }

    // Singleton pattern
    public static TaskManger getInstance() {
        if (instance == null) {
            instance = new TaskManger();
        }
        return instance;
    }

    // Adds a new task to the system
    // Notifies all observers about task creation
    public void addTask(Task t) {
        tasks.add(t);
        notifyObservers("New task '" + t.getTitle() + "' created and assigned to "
                + (t.getAssignedTo() != null ? t.getAssignedTo() : "No one"));
    }

    public void addUser(User u) {
        users.add(u);
        observers.add(u);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<User> getUsers() {
        return users;
    }

    // Observer Pattern
    // Notifies all registered observers about system events
    private void notifyObservers(String message) {
        for (TaskObserver observer : observers) {
            observer.update(message);
        }
    }
}
