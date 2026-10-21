package org.example;

// Interface defines what every notification must do
interface NotificationService {

    // Abstract method implemented by child classes
    void sendNotification(String message);
}

// Email notification implementation
class EmailAlert implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

// SMS notification implementation
class SMSAlert implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

// Main class to execute the program
public class DemoInterface {

    public static void main(String[] args) {

        // Interface reference points to an EmailAlert object
        NotificationService n = new EmailAlert();
        n.sendNotification("Your order has been confirmed!");

        // Same reference now points to an SMSAlert object
        n = new SMSAlert();
        n.sendNotification("Your OTP is 1234");
    }
}
