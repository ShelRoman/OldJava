package proff27;

import org.junit.Before;
import org.junit.Test;
import proff27.hw2.authentication.Auth;

import static org.junit.Assert.assertEquals;

public class AuthTest {

    private Auth module = new Auth();

    @Before
    public void setUp() {
        module = new Auth();
    }

    @Test
    public void testAuthenticateFailure() {
        Auth auth = module;
        boolean actualRes = auth.authenticate("User", "password");
        boolean expectedRes = false;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testAuthenticatePass() {
        Auth auth = module;
        auth.add("User", "password");
        boolean actualRes = auth.authenticate("User", "password");
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testAdd() {
        Auth auth = module;
        auth.add("User", "Password");
        boolean actualRes = auth.getPass("User").equals("Password");
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testRemove() {
        Auth auth = module;
        auth.add("User", "Password");
        auth.remove("User");
        boolean actualRes = auth.containsLogin("User");
        boolean expectedRes = false;
        assertEquals(actualRes, expectedRes);
    }
}
