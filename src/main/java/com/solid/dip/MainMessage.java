package com.solid.dip;

public class MainMessage {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void sendMessage() {
        emailService.sendEmail();
        smsService.sendSMS();
    }
}
