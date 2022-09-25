package comportamentalDesigns.observer;

public interface Observable {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifySubscribers();

    void changeState(final String state);

}
