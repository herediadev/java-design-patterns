package main.demo1;

public interface TwitterService {
    String getTimeline(String screenName);

    void postToTimeline(String screenName, String message);
}
