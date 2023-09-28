package structuralPatterns.adapterPattern;

public class EmailHandler {
    private Email email;

    public EmailHandler(Email email) {
        this.email = email;
    }

    public void sendEmail(EmailProvider provider) {
        provider.sendEmail(email);
    }
}
