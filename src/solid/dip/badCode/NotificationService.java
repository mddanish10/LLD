package solid.dip.badCode;

import solid.isp.goodCode.Scanner;

public class NotificationService {

    private EmailService emailService;
    private SmsNotification smsNotification;

    public NotificationService(EmailService emailService, SmsNotification smsNotification) {
        this.emailService =  emailService;
        this.smsNotification =  smsNotification;
    }

    public  void notifyEmail(String msg){
        emailService.sendEmail();

    }

    public  void notifySms(String msg){
        smsNotification.sendSms();

    }
}


//Here NotificationService is high module service and EmailService , SmsService is low module service. Here they are
// tightly coupled because if we want use WhatsApp notifcation low module then we need to make change in Notification Service
//which is a violation of DIP. Testing is difficult in this class because this service depends on the implementation of EmailService and SmsNotification