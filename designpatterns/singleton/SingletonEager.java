package designpatterns.singleton;

public class SingletonEager {

    private static final SingletonEager instance = new SingletonEager("value3");
    private final String value;


    private SingletonEager(String value){
        this.value = value;
    }

    public static SingletonEager getInstance(){
        return instance;
    }

    public String getValue() {
        return value;
    }
}
