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

    private List<Task> tasks;

    private List<User> users;

    private List<UserObserver> observers;

    private TaskManger() {
        tasks = new ArrayList<>();
        users = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TaskManger getInstance() {
        if (instance == null) {
            instance = new TaskManger();
        }
        return instance;
    }

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

    private void notifyObservers(String message) {
        System.out.println("------------------------------------------------------------");
        for (UserObserver observer : observers) {
            observer.update(message);
        }
        System.out.println("------------------------------------------------------------");
    }
}
