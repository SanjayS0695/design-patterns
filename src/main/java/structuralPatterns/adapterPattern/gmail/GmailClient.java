package structuralPatterns.adapterPattern.gmail;

import structuralPatterns.adapterPattern.Email;

public class GmailClient {

    public void init() {

    }

    public void sendEmail(Email email) {
        System.out.println("Sending email from GmailClient: " + email.getSubject());
    }
}
