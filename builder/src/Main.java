
public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {

        UserData userData = new UserData.Builder()
                .setLogin("user")
                .setPassword("password")
                .setTimestamp(123456L)
                .build();

        System.out.println(userData);
    }

}
