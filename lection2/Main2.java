import model.dto.UserDTO;
import service.UserService;

public class Main2 {
    public static void main(String[] args) {
        // Створення екземпляру класу UserService
        UserService userService = new UserService();

        // Отримання об'єкта UserDTO за допомогою методу getUserById
        UserDTO userDTO = userService.getUserById(1);

        // Вивід інформації про користувача
        System.out.println("Username: " + userDTO.getUsername());
        System.out.println("Email: " + userDTO.getEmail());
    }
}
