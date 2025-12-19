package Logic;

import javax.swing.Timer; // تأكد إنك مستخدم Swing Timer عشان الـ UI Thread
import java.util.function.Consumer;

// NotificationsService
// --------------------
// This class is responsible for displaying temporary notifications in the UI.
// It follows the Singleton Pattern to ensure only one notification system exists.
// It uses Swing Timer to auto-clear notifications after a fixed time.

public class NotificationsService {

    // Holds the single instance of NotificationsService (Singleton)
    private static NotificationsService instance;
    private Timer timer; // ده المتغير اللي هنمسك فيه التايمر

    // Private constructor to prevent direct object creation
    // Enforces the Singleton Pattern
    private NotificationsService() {
    }

    // Returns the single instance of NotificationsService
    // Thread-safe to avoid creating multiple instances in multi-threaded
    // environments
    public static synchronized NotificationsService getInstance() {
        if (instance == null) {
            instance = new NotificationsService();
        }
        return instance;
    }

    public void showNotification(String message, Consumer<String> uiUpdater) {

        // Stops any existing notification timer to avoid overlapping notifications
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // Immediately updates the UI with the new notification message
        uiUpdater.accept("Notification: " + message);

        // Creates a new timer to clear the new notification after 5 seconds
        timer = new Timer(5000, e -> {
            uiUpdater.accept("");
        });

        // Timer runs only once (not repeated)
        timer.setRepeats(false);
        timer.start();
    }
}