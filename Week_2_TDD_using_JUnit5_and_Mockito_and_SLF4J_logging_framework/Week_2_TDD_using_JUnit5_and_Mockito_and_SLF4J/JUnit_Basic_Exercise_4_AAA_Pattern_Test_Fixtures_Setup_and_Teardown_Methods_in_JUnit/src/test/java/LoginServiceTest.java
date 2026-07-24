import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginServiceTest {

    private LoginService loginService;

    @Before
    public void setUp() {
        System.out.println("Creating LoginService object...");
        loginService = new LoginService();
    }

    @After
    public void tearDown() {
        System.out.println("Destroying LoginService object...");
        loginService = null;
    }

    @Test
    public void testValidLogin() {

        // Arrange
        String username = "admin";
        String password = "admin123";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testInvalidLogin() {

        // Arrange
        String username = "admin";
        String password = "wrongPassword";

        // Act
        boolean result = loginService.login(username, password);

        // Assert
        assertFalse(result);
    }
}