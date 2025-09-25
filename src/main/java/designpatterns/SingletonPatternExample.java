package designpatterns;

/**
 * Singleton Pattern Example: Useful in logging, DB connection pools, configuration classes.
 */
class Logger {
    private static Logger instance;
    private Logger() { }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started");
    }
}
