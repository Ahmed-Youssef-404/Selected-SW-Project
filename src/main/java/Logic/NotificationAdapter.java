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

public interface NotificationAdapter {
    void show(String message);
}

class SwingNotificationAdapter implements NotificationAdapter {

    private JTextField notificationTextField;

    public SwingNotificationAdapter(JTextField notificationTextField) {
        this.notificationTextField = notificationTextField;
    }

    @Override
    public void show(String message) {
        notificationTextField.setText(message);
    }
}

class ConsoleNotificationAdapter implements NotificationAdapter {

    @Override
    public void show(String message) {
        System.out.println(message);
    }
}
