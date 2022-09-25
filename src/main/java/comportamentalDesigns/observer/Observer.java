package comportamentalDesigns.observer;

public interface Observer {
    void subscribe(Observable observable);
    void unsubscribe(Observable observable);
    void changeState(final String state);
    String getLastestState();
}
