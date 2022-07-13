package observer;

import java.util.HashSet;
import java.util.Set;

public class Channel implements Subject{

    private String name;
    private Set<Observer> subscribers;
    private Set<Event> videos;

    public Channel(String name) {
        this.name =  name;
        subscribers = new HashSet<>();
        videos = new HashSet<>();
        System.out.println("Channel " + name + " is created! Start uploading content asap!");
    }
    public void subscribeUser(Observer subscriber) {
        subscribers.add(subscriber);
        System.out.println("Thankyou " + subscriber.getName() + " for subscribing to " + name);
    }

    public void unsubscribeUser(Observer subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Sorry to see you go " + subscriber.getName() + ", you can subscribe back to "+ name
                +" whenever you want!");
    }

    @Override
    public void notifyObservers(Event video) {
        for (Observer subscriber : subscribers) {
            System.out.println("Hey " + subscriber.getName() + ", rush to youtube to watch the video :" +
                    video.getTitle());
            subscriber.update(this);
        }
    }

    public void uploadVideo(Event video) {
        videos.add(video);
        System.out.println(video.getTitle() + " got successfully uploaded in channel");
        notifyObservers(video);
        System.out.println("All subscribers are notified about the new video");
    }

    public String getName() {
        return name;
    }
}
