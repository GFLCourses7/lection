package designpatterns.singleton;

public class SingletonSynchronized {

    private static SingletonSynchronized instance;
    private final String value;

    private SingletonSynchronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonSynchronized getInstance(String value) {
        if (instance == null) {
            instance = new SingletonSynchronized(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
