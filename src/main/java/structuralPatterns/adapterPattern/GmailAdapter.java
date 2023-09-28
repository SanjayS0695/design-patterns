package structuralPatterns.adapterPattern;

import structuralPatterns.adapterPattern.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }
    @Override
    public void sendEmail(Email email) {
        this.gmailClient.init();
        this.gmailClient.sendEmail(email);
    }
}
