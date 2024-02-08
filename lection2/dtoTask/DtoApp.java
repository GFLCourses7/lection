import dto.UserDTO;

public class DtoApp {

    public static void main(String[] args) {
        UserDTO user1 = new UserDTO(1, "admin", "admin@mail.com");

        System.out.println(user1);
    }
}
