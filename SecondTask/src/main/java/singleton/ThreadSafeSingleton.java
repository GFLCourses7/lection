package singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private String value;

    private ThreadSafeSingleton(String value) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        this.value = value;
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

}
