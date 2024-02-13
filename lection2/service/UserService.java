package service;

import model.dto.UserDTO;
import model.entity.User;

public class UserService {
    public UserDTO getUserById(int userId) {
        // Логіка отримання користувача з бази даних чи іншого джерела даних
        // Припустимо, що ми маємо об'єкт User
        User user = getUserFromDatabaseById(userId);

        // Ми конвертуємо об'єкт User у об'єкт UserDTO перед відправленням його клієнту
        return convertToDTO(user);
    }

    private User getUserFromDatabaseById(int userId) {
        // Логіка отримання користувача з бази даних
        // Повертаємо макетний об'єкт User
        return new User("KurtCobain", "kurtcobain@example.com");
    }

    private UserDTO convertToDTO(User user) {
        // Логіка конвертації об'єкта User у об'єкт UserDTO
        return new UserDTO(user.getUsername(), user.getEmail());
    }
}