package org.example.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        //Lazy
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance("value1");
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance("value2");

        System.out.println(singletonLazy1.getValue());
        System.out.println(singletonLazy2.getValue());

        //Thread safe
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            SingletonMultiThread singletonMultiThread1 = SingletonMultiThread.getInstance("SingletonMultiThread1");
            System.out.println(singletonMultiThread1.getValue());
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            SingletonMultiThread singletonMultiThread2 = SingletonMultiThread.getInstance("SingletonMultiThread2");
            System.out.println(singletonMultiThread2.getValue());
        }
    }
}
