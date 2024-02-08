package dto;

public class UserDTO {
    private long id;
    private String username;
    private String email;

    // Конструктор
    public UserDTO(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // Геттери та сеттери
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    // Перевизначення методу toString() для зручного виведення об'єкта у вигляді рядка
    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
