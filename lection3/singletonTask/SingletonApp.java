import singleton.DatabaseConnection;

public class SingletonApp {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        boolean connect = connection.connect();
        if (connect) {
            connection.executeQuery("SELECT * FROM users");
            connection.executeQuery("UPDATE products SET price = 20 WHERE id = 1");
        }
    }
}