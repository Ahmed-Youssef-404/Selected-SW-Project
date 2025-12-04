package Logic;

import java.util.ArrayList;
import java.util.List;

public class TaskManger {

    private static TaskManger instance;

    private List<Task> tasks;
    private List<User> users;
    private List<TaskObserver> observers;

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
        notifyObservers("New task '" + t.getTitle() + "' created and assigned to " + (t.getAssignedTo() != null ? t.getAssignedTo() : "No one"));
    }
    
//    public void completeTask(Task t){
//        t.setStatus("Completed");
//        notifyObservers("Task '" + t.getTitle() + "' has been marked as Completed by " + t.getAssignedTo());
//    }

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
    
    private void notifyObservers(String message){
        for(TaskObserver observer: observers){
            observer.update(message);
        }
        NotificationsService.getInstance().sendNotification(message);
    }
}
