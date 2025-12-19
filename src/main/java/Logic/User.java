package Logic;

// Observer interface
// Any class interested in task updates must implement this interface
interface TaskObserver {
    void update(String message);
}

// User
// ----
// Represents a system user.
// Implements TaskObserver to receive notifications.

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

    // Observer Pattern
    @Override
    // Called automatically when a system event occurs
    // Displays notification message for the user
    public void update(String message) {
        System.out.println("Notification to " + name + " [" + role + "]: " + message);
    }
}
