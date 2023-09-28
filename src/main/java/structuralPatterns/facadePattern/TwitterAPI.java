package structuralPatterns.facadePattern;

public interface TwitterAPI {
    void execute(String accessToken, Tweet tweet);
}
