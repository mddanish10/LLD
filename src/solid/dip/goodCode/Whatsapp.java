package solid.dip.goodCode;

public class Whatsapp implements  NotificationChannel{
    @Override
    public void sendNotification(String msg) {
        System.out.println("this is whatsapp notification "+msg);
    }
}
