package observer;

public interface Subject {

    void notifyObservers(Event event);

    void uploadVideo(Event event);

    void unsubscribeUser(Observer subscriber);

    void subscribeUser(Observer subscriber);

    String getName();
}
