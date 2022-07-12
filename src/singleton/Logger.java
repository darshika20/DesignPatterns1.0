package singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Logger {

    private static int noOfInstances;
    private static Logger logger;
    private static ReentrantLock reentrantLock = new ReentrantLock();
    private Logger() {
        noOfInstances++;
        System.out.println(noOfInstances + " Logger instances are initialized");
    }

    public static Logger getLogger() {
        if (logger == null) {
            reentrantLock.lock();
            try {
                if (logger == null) {
                    logger = new Logger();
                }
                return logger;
            } catch (Exception ex) {
                return null;
            } finally {
                reentrantLock.unlock();
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

}
