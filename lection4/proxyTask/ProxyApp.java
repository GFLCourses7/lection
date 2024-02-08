import proxy.UserQueryLogger;
import service.Query;

public class ProxyApp {
    public static void main(String[] args) {
        Query userQuery = new UserQueryLogger();

        String queryUserByName = userQuery.findByName("Denys");

        System.out.println(queryUserByName);
    }
}
