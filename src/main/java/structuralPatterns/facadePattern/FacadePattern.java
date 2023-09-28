package structuralPatterns.facadePattern;

public class FacadePattern {

    public static void main(String[] args) {
        var createAPITest = new TwitterService(new CreateTweetAPI());
        createAPITest.execute("twitter", new Tweet("Hello World"));
        //Access Denied

        var createAPI = new TwitterService(new CreateTweetAPI());
        createAPI.execute("REQUEST_TOKEN", new Tweet("Hello World"));
        //Create Tweet: Hello World accessToken:ACCESS_TOKEN

        var likeAPI = new TwitterService(new LinkTweetAPI());
        likeAPI.execute("REQUEST_TOKEN", new Tweet("Hello World"));
        //Liked Tweet: Hello World accessToken:ACCESS_TOKEN

    }
}
