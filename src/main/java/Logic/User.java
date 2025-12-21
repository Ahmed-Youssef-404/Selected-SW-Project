package Logic;

// Observer interface
// Any class interested in task updates must implement this interface
interface UserObserver {
    void update(String message);
}

// User
// ----
// Represents a system user.
// Implements TaskObserver to receive notifications.

public class User implements UserObserver {

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

    @Override
    public void update(String message) {

        NotificationAdapter adapter = new ConsoleNotificationAdapter();

        adapter.show("Notification to " + name + " [" + role + "]: " + message);
    }
}
