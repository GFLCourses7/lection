package singleton;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton("test 3");
    private String value;

    private EagerSingleton(String value) {
        this.value = value;
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public String getValue() {
        return value;
    }
}
