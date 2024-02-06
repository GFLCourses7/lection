package org.example.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    private final String value;

    private SingletonLazy(String value){
        this.value = value;
    }

    public static SingletonLazy getInstance(String value) {
        if (instance == null) {
            instance = new SingletonLazy(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
