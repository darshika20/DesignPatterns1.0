package observer;

import java.util.HashSet;
import java.util.Set;

public class Subscriber implements Observer{

    private String name;
    private Set<Subject> channels;

    public Subscriber(String name) {
        this.channels = new HashSet<>();
        this.name = name;
        System.out.println(name + ", you have successfully registered as a user in Youtube! Start watching content " +
                "that interests you, we have a plethora of content at your service!");
    }

    public String getName() {
        return name;
    }

    public void subscribeToChannel(Subject channel) {
        channels.add(channel);
        channel.subscribeUser(this);
        System.out.println("Hurray!" + name + ", you have subscribed to channel " + channel.getName());
    }

    public void unsubscribeToChannel(Subject channel) {
        channels.remove(channel);
        channel.unsubscribeUser(this);
        System.out.println(name + ", you have been successfully unsubscribed from channel " + channel.getName());
    }

    public void update(Subject channel) {
        System.out.println("Hey " + name + ", New Video got uploaded in channel: " + channel.getName());
    }
}
