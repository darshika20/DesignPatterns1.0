package observer;

public class ObserverFactory {

    public static Observer createObserverInstance(String observerName) {
        return new Subscriber(observerName);
    }
}
