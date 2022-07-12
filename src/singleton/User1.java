package singleton;

public class User1 implements Runnable{
    private String message;
    public User1(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        Logger logger = Logger.getLogger();
        logger.log(message);
    }
}
