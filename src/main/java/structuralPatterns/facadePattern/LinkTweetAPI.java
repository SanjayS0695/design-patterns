package structuralPatterns.facadePattern;

public class LinkTweetAPI implements TwitterAPI {

    @Override
    public void execute(String accessToken, Tweet tweet) {
        if (accessToken.equals("ACCESS_TOKEN")) {
            System.out.println("Liked Tweet: "  + tweet.getMessage() + " accessToken:" + accessToken);
        } else {
            System.out.println(accessToken);
        }
    }
}
