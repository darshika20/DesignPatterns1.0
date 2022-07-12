package singleton;

public class User2 implements Runnable{
    private String message;
    public User2(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        Logger logger = Logger.getLogger();
        logger.log(message);
    }
}
