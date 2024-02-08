package proxy;

import service.Query;
import service.UserQuery;

public class UserQueryLogger implements Query {
    private final UserQuery userQuery;

    public UserQueryLogger() {
        this.userQuery = new UserQuery();
    }

    @Override
    public String findByName(String name) {
        System.out.printf("Creating query for user %s:\n", name);
        return "\t" + userQuery.findByName(name);
    }
}
