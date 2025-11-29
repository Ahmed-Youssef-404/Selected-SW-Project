package Logic;

public class NotificationsService {

    public static NotificationsService instance;

    private NotificationsService() {
    }

    public static NotificationsService getInstance() {
        if (instance == null) {
            instance = new NotificationsService();
        }
        return instance;
    }
    
    public String sendNotification(String message){
        return "Notification: " + message;
    }
}
