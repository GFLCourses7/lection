
public class Main {

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {

        UserData userData1 = new UserData("John", "John's password", 100087L);
        UserData userData2 = new UserData("Micheal", "Micheal's password", 100087L);
        UserData userData3 = new UserData("Micheal", "Micheal's password", 100087L);

        System.out.println(userData1);
        System.out.println(userData2);
        System.out.println(userData3);

        System.out.println("Userdata1 equals Userdata2: " + userData1.equals(userData2));
        System.out.println("Userdata2 equals Userdata3: " + userData2.equals(userData3));

        userData2.setPassword("123");

        System.out.println("Userdata2 equals Userdata3: " + userData2.equals(userData3));
    }

}
