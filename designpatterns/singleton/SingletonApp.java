package designpatterns.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        System.out.println("============== Lazy =============");
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance("value1");
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance("value2");

        System.out.println(singletonLazy1.getValue());
        System.out.println(singletonLazy2.getValue());

        System.out.println("============== Eager =============");
        SingletonEager singletonEager1 = SingletonEager.getInstance();

        System.out.println(singletonEager1.getValue());

        System.out.println("============== Synchronized =============");
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());
        thread1.start();
        thread2.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            SingletonSynchronized singletonMultiThread1 = SingletonSynchronized.getInstance("value1");
            System.out.println(singletonMultiThread1.getValue());
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            SingletonSynchronized singletonMultiThread2 = SingletonSynchronized.getInstance("value2");
            System.out.println(singletonMultiThread2.getValue());
        }
    }
}
