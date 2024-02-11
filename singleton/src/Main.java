public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {


        SingletonLazy.getInstance().setText("Hello, World! I'm lazy");
        System.out.println(SingletonLazy.getInstance().getText());

        SingletonEager.getInstance().setText("Hello, World! I'm eager!");
        System.out.println(SingletonEager.getInstance().getText());

        Thread thread1 = new Thread(() -> {
           SingletonSync.getInstance().setText("Hello, World! I'm synced 1");
        });

        Thread thread2 = new Thread(() -> {
            SingletonSync.getInstance().setText("Hello, World! I'm synced 2");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SingletonSync.getInstance().getText());

    }

}
