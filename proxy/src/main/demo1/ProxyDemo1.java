package main.demo1;

public class ProxyDemo1 {
    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(service.getTimeline("bh5k"));

        service.postToTimeline("test", "some message");
    }
}
