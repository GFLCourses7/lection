public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {

        SingletonLazy.getInstance().setText("Hello, World!");

        System.out.println(SingletonLazy.getInstance().getText());
    }

}
