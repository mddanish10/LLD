package solid.dip.goodCode;

public class SMS implements NotificationChannel{
    @Override
    public void sendNotification( String msg) {
        System.out.println("this is used for sending SMS "+msg);
    }
}
