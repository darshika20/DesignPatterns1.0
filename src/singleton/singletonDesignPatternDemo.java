package singleton;

public class singletonDesignPatternDemo {

    public static void main(String[] args) {
        User1 user1 = new User1("this is user1");
        User2 user2 = new User2("this is user2");
        Thread thread1 = new Thread(user1);
        Thread thread2 = new Thread(user2);
        thread1.start();
        thread2.start();
    }
}
