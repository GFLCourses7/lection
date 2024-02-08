package service;

public class UserQuery implements Query {
    @Override
    public String findByName(String name) {
        return String.format("SELECT * FROM user WHERE name = %s;", name);
    }
}
