package Logic;

import javax.swing.Timer; // تأكد إنك مستخدم Swing Timer عشان الـ UI Thread
import java.util.function.Consumer;

public class NotificationsService {

    private static NotificationsService instance;
    private Timer timer; // ده المتغير اللي هنمسك فيه التايمر

    private NotificationsService() {
    }

    // Thread-safe Singleton (تعديل بسيط للأمان)
    public static synchronized NotificationsService getInstance() {
        if (instance == null) {
            instance = new NotificationsService();
        }
        return instance;
    }

    /**
     * @param message الرسالة اللي عايز تعرضها
     * @param uiUpdater دالة (Callback) بتستقبل النص عشان تحدث الـ UI
     */
    public void showNotification(String message, Consumer<String> uiUpdater) {
        
        // 1. لو في تايمر قديم شغال، اقتله فوراً
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }

        // 2. اعرض الرسالة الجديدة فوراً
        uiUpdater.accept("Notification: " + message);

        // 3. جهز التايمر الجديد إنه يمسح الرسالة بعد 5 ثواني
        timer = new Timer(5000, e -> {
            uiUpdater.accept(""); // ابعت نص فاضي عشان يمسح
        });
        
        timer.setRepeats(false); // يشتغل مرة واحدة بس
        timer.start();
    }
}