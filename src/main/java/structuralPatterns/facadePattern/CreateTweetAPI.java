package structuralPatterns.facadePattern;

public class CreateTweetAPI implements TwitterAPI{

    @Override
    public void execute(String accessToken, Tweet tweet) {
        if (accessToken.equals("ACCESS_TOKEN")) {
            System.out.println("Create Tweet: "  + tweet.getMessage() + " accessToken:" + accessToken);
        } else {
            System.out.println(accessToken);
        }
    }
}
