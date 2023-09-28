package structuralPatterns.facadePattern;

public class Tweet {

    public String getMessage() {
        return message;
    }

    private String message;

    public Tweet(String message) {
        this.message = message;
    }
}
