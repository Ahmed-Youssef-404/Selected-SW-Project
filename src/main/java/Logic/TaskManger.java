package Logic;

import java.util.ArrayList;
import java.util.List;

public class TaskManger {

    private static TaskManger instance;

    private List<Task> tasks;
    private List<User> users;

    private TaskManger() {
        tasks = new ArrayList<>();
        users = new ArrayList<>();
    }

    public static TaskManger getInstance() {
        if (instance == null) {
            instance = new TaskManger();
        }
        return instance;
    }
    
    public void addTask(Task t){
        tasks.add(t);
    }
    public List<Task> getTasks(){
        return tasks;
    }
    
    public void addUser(User u){
        users.add(u);
    }
    public List<User> getUsers(){
        return users;
    }
}
