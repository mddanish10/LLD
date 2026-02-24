package solid.dip.goodCode;

public class Client {
    static void main() {
        NotificationService notificationService = new NotificationService( new Email());
        notificationService.notifyNotification("send the notifcation via email");

        NotificationService notificationService1 = new NotificationService( new SMS());
        notificationService1.notifyNotification("send notofication via sms");

        NotificationService notificationService2 = new NotificationService(new Whatsapp());
        notificationService2.notifyNotification("send notification via whatsapp");
    }
}
