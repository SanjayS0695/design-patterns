package structuralPatterns.adapterPattern;

public class EmailClient implements EmailProvider {

    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending email from EmailClient:" + email.getSubject());
    }
}
