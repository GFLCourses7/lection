package singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public boolean connect() {
        System.out.println("З'єднання з базою даних...");
        return true;//for testing purposes
    }

    public Integer executeQuery(String query) {
        System.out.println("Виконання запиту: " + query);
        return 1;//for testing purposes
    }

}
