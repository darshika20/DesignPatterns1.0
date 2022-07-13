package observer;

public class Youtube {

    public static void main(String[] args) {

        Observer subscriber1 = ObserverFactory.createObserverInstance("Darshika");
        Observer subscriber2 = ObserverFactory.createObserverInstance("Usha");
        Observer subscriber3 = ObserverFactory.createObserverInstance("Sneha");
        Observer subscriber4 = ObserverFactory.createObserverInstance("Deepika");
        Observer subscriber5 = ObserverFactory.createObserverInstance("Pradeep");

        Subject channel = SubjectFactory.createSubjectInstance("Family");

        subscriber1.subscribeToChannel(channel);
        subscriber2.subscribeToChannel(channel);
        subscriber3.subscribeToChannel(channel);
        subscriber4.subscribeToChannel(channel);
        subscriber5.subscribeToChannel(channel);

        Event video = EventFactory.createEventInstance("Welcome Video!");

        channel.uploadVideo(video);

        subscriber1.unsubscribeToChannel(channel);

        channel.uploadVideo(new Video("Family fun"));

        Channel designChannel = new Channel("Designing system");

        subscriber1.subscribeToChannel(designChannel);

        designChannel.uploadVideo(new Video("Observer design pattern explaination"));

        subscriber4.subscribeToChannel(designChannel);

        designChannel.uploadVideo(new Video("Introduction to design patterns"));
    }
}
