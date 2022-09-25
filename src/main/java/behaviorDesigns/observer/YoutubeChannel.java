package behaviorDesigns.observer;


import java.util.LinkedList;
import java.util.List;

public class YoutubeChannel implements Observable {
    private final List<Observer> subscribers;
    private String lastUploadedVideo;

    public YoutubeChannel() {
        subscribers = new LinkedList<>();
        lastUploadedVideo = "";
    }


    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(x -> x.changeState(this.lastUploadedVideo));
    }

    @Override
    public void changeState(String state) {
        lastUploadedVideo = state;
        notifySubscribers();
    }
}
