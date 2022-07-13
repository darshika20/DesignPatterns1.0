package observer;

public class EventFactory {

    public static Event createEventInstance(String eventName) {
        return new Video(eventName);
    }
}
