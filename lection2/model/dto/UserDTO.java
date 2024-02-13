package model.dto;

public class UserDTO {
    private String username;
    private String email;

    // Конструктор без параметрів (потрібний для серіалізації/десеріалізації JSON)
    public UserDTO() {}

    // Конструктор з параметрами
    public UserDTO(String username, String email) {
        this.username = username;
        this.email = email;
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
}