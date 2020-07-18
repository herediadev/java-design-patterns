package main.demo1;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterServiceImpl implements TwitterService {

    public static final String AUTH_CONSUMER_KEY = "";
    public static final String AUTH_CONSUMER_SECRET = "";
    public static final String AUTH_ACCESS_TOKEN = "";
    public static final String ACCESS_TOKEN_SECRET = "";

    @Override
    public String getTimeline(String screenName) {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder
                .setDebugEnabled(true)
                .setOAuthConsumerKey(AUTH_CONSUMER_KEY)
                .setOAuthConsumerSecret(AUTH_CONSUMER_SECRET)
                .setOAuthAccessToken(AUTH_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);
        TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
        Twitter twitter = twitterFactory.getInstance();
        StringBuilder builder = new StringBuilder();

        try {
            Query query = new Query(screenName);
            QueryResult result;

            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                tweets.forEach(tweet -> builder
                        .append("@")
                        .append(tweet.getUser().getScreenName())
                        .append(" - ")
                        .append(tweet.getText())
                        .append("\n"));
            } while ((query = result.nextQuery()) != null);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to search tweets: " + e.getMessage());
        }

        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        //we are not going to allow this
    }
}
