import dto.UserDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DtoAppTest {
    @Test
    public void testUserDTO() {
        UserDTO userDTO = new UserDTO(1, "john_doe", "john@example.com");

        assertEquals(1, userDTO.getId());
        assertEquals("john_doe", userDTO.getUsername());
        assertEquals("john@example.com", userDTO.getEmail());

        userDTO.setId(2);
        userDTO.setUsername("jane_doe");
        userDTO.setEmail("jane@example.com");

        assertEquals(2, userDTO.getId());
        assertEquals("jane_doe", userDTO.getUsername());
        assertEquals("jane@example.com", userDTO.getEmail());
    }

    @Test
    public void testToString() {
        UserDTO userDTO = new UserDTO(1, "john_doe", "john@example.com");

        String expectedString = "UserDTO{id=1, username='john_doe', email='john@example.com'}";
        assertEquals(expectedString, userDTO.toString());
    }
}