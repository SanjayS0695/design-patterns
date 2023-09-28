package structuralPatterns.facadePattern;

public class TwitterService {

    private TwitterAPI twitterAPI;

    protected TwitterService(TwitterAPI twitterAPI) {
        this.twitterAPI = twitterAPI;
    }

    private String getAccessToken(String requestToken) {
            if (requestToken.equals("REQUEST_TOKEN")) {
                return "ACCESS_TOKEN";
            }
            return "Access Denied";
    }

    public void execute(String requestToken, Tweet tweet) {
        twitterAPI.execute(this.getAccessToken(requestToken), tweet);
    }
}
