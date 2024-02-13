package model.entity;

public class User {
    private String username;
    private String email;
    private int age;
    private String password;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User(String username, String email, int age, String password) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    // Додаткові властивості юзера:
    public void sendMessageByEmail(String massage, String email) {
        System.out.println("The message to " + email + " mail was successfully sent");
    }

    public void calculateTheAgeDifference(int anotherAge) {
        System.out.println("The age difference is - " + Math.abs(this.age-anotherAge) + " years");
    }

    // Геттери та сеттери
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}