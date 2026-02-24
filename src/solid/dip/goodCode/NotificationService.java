package solid.dip.goodCode;

public class NotificationService {
   public  NotificationChannel notificationChannel;

   public NotificationService(NotificationChannel channel){
       this.notificationChannel=channel;
   }
   public void notifyNotification(String msg){
       notificationChannel.sendNotification(msg);
   }

}
