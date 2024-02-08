import org.junit.jupiter.api.Test;
import singleton.DatabaseConnection;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonAppTest {

    @Test
    public void testSingletonInstance() {
        DatabaseConnection instance1 = DatabaseConnection.getInstance();
        DatabaseConnection instance2 = DatabaseConnection.getInstance();

        assertSame(instance1, instance2);
    }

    @Test
    public void testDatabaseConnection() {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        boolean connected = connection.connect();

        assertTrue(connected);
    }

    @Test
    public void testExecuteQuery() {
        DatabaseConnection connection = DatabaseConnection.getInstance();

        Integer i = connection.executeQuery("SELECT * FROM users");

        assertEquals(1, i);
    }
}
