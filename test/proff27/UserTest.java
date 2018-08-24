package proff27;

import org.junit.Before;
import org.junit.Test;
import proff27.hw2.hash.User;

import static org.junit.Assert.assertEquals;


public class UserTest {

    private User module = new User();

    @Before
    public void setUp() {
        module = new User();
    }

    @Test
    public void testEqualsSelf() {
        User user1 = module;
        boolean actualRes = user1.equals(user1);
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testEqualsTwoObj() {
        User user1 = module;
        User user2 = module;
        boolean actualRes = user1.equals(user2);
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testEqualsReverseTwoObj() {
        User user1 = module;
        User user2 = module;
        boolean actualRes = user1.equals(user2) && user2.equals(user1);
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testHashCodeSelf() {
        User user1 = module;
        boolean actualRes = user1.hashCode() == user1.hashCode();
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testHashTwoObj() {
        User user1 = module;
        User user2 = module;
        boolean actualRes = user1.hashCode() == user2.hashCode();
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }

    @Test
    public void testHashThreeObj() {
        User user1 = module;
        User user2 = module;
        User user3 = module;
        boolean actualRes = user1.hashCode() == user2.hashCode() && user2.hashCode() == user3.hashCode() && user3.hashCode() == user1.hashCode();
        boolean expectedRes = true;
        assertEquals(actualRes, expectedRes);
    }
}
