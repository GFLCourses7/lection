import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.UserQueryLogger;
import service.Query;
import service.UserQuery;

import static org.junit.jupiter.api.Assertions.*;

class ProxyAppTest {
    Query query;
    Query proxiedQuery;
    String name = "Test name";
    String output = String.format("SELECT * FROM user WHERE name = %s;", name);

    @BeforeEach
    void setUp() {
        query = new UserQuery();
        proxiedQuery = new UserQueryLogger();
    }

    @Test
    void testProxy() {
        String byName = query.findByName(name);

        assertEquals(output, byName);

        String proxiedByName = proxiedQuery.findByName(name);

        assertEquals("\t" + output, proxiedByName);
    }
}