package behaviorDesigns.observer;

public class YoutubeUser implements Observer {
    private String latestUploadedVideo;

    @Override
    public void subscribe(Observable observable) {
        observable.subscribe(this);
    }

    @Override
    public void unsubscribe(Observable observable) {
        observable.unsubscribe(this);
    }

    @Override
    public void changeState(String state) {
        latestUploadedVideo = state;
    }

    @Override
    public String getLastestState() {
        return latestUploadedVideo;
    }
}
