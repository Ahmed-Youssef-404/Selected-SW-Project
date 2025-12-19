package Logic;

import javax.swing.JTextField;

/*
 * Adapter Pattern Implementation
 * ------------------------------
 * This file contains:
 * 1) Target interface (NotificationAdapter)
 * 2) Concrete Adapter (SwingNotificationAdapter)
 *
 * Purpose:
 * Adapt notification messages to different output types
 * without changing the NotificationsService logic.
 */

// Target interface
// Defines a unified method for showing notifications
public interface NotificationAdapter {
    void show(String message);
}

// Concrete Adapter
// Adapts notification messages to a Swing JTextField
class SwingNotificationAdapter implements NotificationAdapter {

    private JTextField notificationTextField;

    // Constructor receives the UI component to adapt to
    public SwingNotificationAdapter(JTextField notificationTextField) {
        this.notificationTextField = notificationTextField;
    }

    @Override
    public void show(String message) {
        // Displays the notification inside the text field
        notificationTextField.setText(message);
    }
}

// Concrete Adapter
// Adapts notification messages to the console (terminal)
class ConsoleNotificationAdapter implements NotificationAdapter {

    @Override
    public void show(String message) {
        // Displays the notification in the terminal
        System.out.println(message);
    }
}
