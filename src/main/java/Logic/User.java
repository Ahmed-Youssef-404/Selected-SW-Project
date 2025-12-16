package Logic;

interface TaskObserver {
    void update(String message);
}

public class User implements TaskObserver {

    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return name;
    }

//     Observer Pattern
    @Override
    public void update(String message) {
        System.out.println("Notification to " + name + " [" + role + "]: " + message);
    }
}
