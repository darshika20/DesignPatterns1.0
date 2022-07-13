package observer;

public interface Observer {

    void update(Subject channel);

    void subscribeToChannel(Subject channel);

    void unsubscribeToChannel(Subject channel);

    String getName();

}
