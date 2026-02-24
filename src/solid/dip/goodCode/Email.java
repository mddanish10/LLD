package solid.dip.goodCode;

public class Email implements NotificationChannel {
    @Override
    public void sendNotification(String msg) {
        System.out.println("this is use for sending email"+msg);
    }
}
