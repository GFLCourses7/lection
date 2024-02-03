package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        // lazy singleton
        LazySingleton test1 = LazySingleton.getInstance("test 1");
        LazySingleton test2 = LazySingleton.getInstance("test 2");

        System.out.println(test1.getValue());
        System.out.println(test2.getValue());

        //eager singleton
        EagerSingleton test3 = EagerSingleton.getInstance();
        System.out.println(test3.getValue());

        //thread safe singleton
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton test4 = ThreadSafeSingleton.getInstance("test 1");
            System.out.println(test4.getValue());
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton test5 = ThreadSafeSingleton.getInstance("test 2");
            System.out.println(test5.getValue());
        }
    }
}
