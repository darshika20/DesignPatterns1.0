package observer;

public class Youtube {

    public static void main(String[] args) {

        Subscriber subscriber1 = new Subscriber("Darshika");
        Subscriber subscriber2 = new Subscriber("Sneha");
        Subscriber subscriber3 = new Subscriber("Usha");
        Subscriber subscriber4 = new Subscriber("Deepika");
        Subscriber subscriber5 = new Subscriber("Pradeep");

        Channel channel = new Channel("Family");

        subscriber1.subscribeToChannel(channel);
        subscriber2.subscribeToChannel(channel);
        subscriber3.subscribeToChannel(channel);
        subscriber4.subscribeToChannel(channel);
        subscriber5.subscribeToChannel(channel);

        Video video = new Video("Welcome Video!");

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
