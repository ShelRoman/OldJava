package training.eugene;

import training.eugene.string.StringTask;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author XXX
 */
public class StringTaskTest {

    /**
     * Test of firstTask method, of class StringTask.
     */
    @Test
    public void testFirstTask() {
        System.out.println("firstTask");
        String string = "Dong-ding-dong";
        int expResult = 12;
        int result = StringTask.firstTask(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of firstTaskSecondVariant method, of class StringTask.
     */
    @Test
    public void testFirstTaskSecondVariant() {
        System.out.println("firstTaskSecondVariant");
        String string = "Dong-ding-dong";
        int expResult = 12;
        int result = StringTask.firstTaskSecondVariant(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of secondTaskEquallityIgnotingCaes method, of class StringTask.
     */
    @Test
    public void testSecondTaskEquallityIgnotingCaes() {
        System.out.println("secondTaskEquallityIgnotingCaes");
        String string = "Dong-ding-dong";
        String otherString = "dong-ding-dong";
        boolean expResult = true;
        boolean result = StringTask.secondTaskEquallityIgnotingCaes(string, otherString);
        assertEquals(expResult, result);
    }

    /**
     * Test of thirdTaskUpperCase method, of class StringTask.
     */
    @Test
    public void testThirdTaskUpperCase() {
        System.out.println("thirdTaskUpperCase");
        String string = "Dong-ding-dong";
        String expResult = "DONG-DING-DONG";
        String result = StringTask.thirdTaskUpperCase(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of thirdTaskLowerCase method, of class StringTask.
     */
    @Test
    public void testThirdTaskLowerCase() {
        System.out.println("thirdTaskLowerCase");
        String string = "Dong-ding-dong";
        String expResult = "dong-ding-dong";
        String result = StringTask.thirdTaskLowerCase(string);
        assertEquals(expResult, result);
    }

    /**
     * Test of fourthTaskIndex method, of class StringTask.
     */
    @Test
    public void testFourthTaskIndex() {
        System.out.println("fourthTaskIndex");
        String string = "Dong-ding-dong";
        String dong = "dong";
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        expResult.add(10);
        ArrayList result = StringTask.fourthTaskIndex(string, dong);
        assertEquals(expResult, result);
    }

    /**
     * Test of fifthTaskWordsAmount method, of class StringTask.
     */
    @Test
    public void testFifthTaskWordsAmount() {
        System.out.println("fifthTaskWordsAmount");
        String string = "Dong-ding-dong";
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("ding", 1);
        expResult.put("dong", 2);
        Map result = StringTask.fifthTaskWordsAmount(string);
        assertEquals(expResult, result);
    }

}
