package Logic;

import javax.swing.Timer; // تأكد إنك مستخدم Swing Timer عشان الـ UI Thread
import java.util.function.Consumer;

// NotificationsService
// --------------------
// This class is responsible for displaying temporary notifications in the UI.
// It follows the Singleton Pattern to ensure only one notification system exists.
// It uses Swing Timer to auto-clear notifications after a fixed time.

public class NotificationsService {

    private static NotificationsService instance;
    private Timer timer;

    private NotificationsService() {
    }

    public static synchronized NotificationsService getInstance() {
        if (instance == null) {
            instance = new NotificationsService();
        }
        return instance;
    }

    public void showNotification(String message, Consumer<String> uiUpdater) {

        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        uiUpdater.accept("Notification: " + message);

        timer = new Timer(5000, e -> {
            uiUpdater.accept("");
        });

        timer.setRepeats(false);
        timer.start();
    }
}