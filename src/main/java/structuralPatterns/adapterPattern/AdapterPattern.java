package structuralPatterns.adapterPattern;

import structuralPatterns.adapterPattern.gmail.GmailClient;

public class AdapterPattern {
    public static void main(String[] args) {
        var email = new Email();
        email.setSubject("test email");
        var handler = new EmailHandler(email);
        handler.sendEmail(new EmailClient());
        //Sending email from EmailClient:test email

        handler.sendEmail(new GmailAdapter(new GmailClient()));
        //Sending email from GmailClient: test email
    }
}
