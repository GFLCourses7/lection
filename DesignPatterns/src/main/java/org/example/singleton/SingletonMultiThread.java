package org.example.singleton;

public class SingletonMultiThread {
    private static SingletonMultiThread instance;
    private String value;

    private SingletonMultiThread(String value) {
        this.value = value;
    }

    public static synchronized SingletonMultiThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonMultiThread(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
