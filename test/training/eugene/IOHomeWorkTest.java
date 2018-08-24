package training.eugene;

import training.eugene.io.IOHomeWork;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author XXX
 */
public class IOHomeWorkTest {

    /**
     * Test of getFirstDifference method, of class IOHomeWork.
     */
    @Test
    public void testGetFirstDifference() {
        System.out.println("getFirstDifference");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, false);
        int expResult = 4;
        int result = instance.getFirstDifference();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountDifference method, of class IOHomeWork.
     */
    @Test
    public void testGetAmountDifference() {
        System.out.println("getAmountDifference");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, false);
        long expResult = 2;
        long result = instance.getAmountDifference();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEqual method, of class IOHomeWork.
     */
    @Test
    public void testIsEqual() {
        System.out.println("isEqual");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, false);
        boolean expResult = false;
        boolean result = instance.isEqual();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirstDifference method, of class IOHomeWork, UNICODE format
     */
    @Test
    public void testGetFirstDifferenceUnicode() {
        System.out.println("getFirstDifference");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, true);
        int expResult = 2;
        int result = instance.getFirstDifference();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountDifference method, of class IOHomeWork, UNICODE format
     */
    @Test
    public void testGetAmountDifferenceUnicode() {
        System.out.println("getAmountDifference");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, true);
        long expResult = 2;
        long result = instance.getAmountDifference();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEqual method, of class IOHomeWork, UNICODE format
     */
    @Test
    public void testIsEqualUnicode() {
        System.out.println("isEqual");
        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");
        IOHomeWork instance = new IOHomeWork(fileOne, fileTwo, true);
        boolean expResult = false;
        boolean result = instance.isEqual();
        assertEquals(expResult, result);
    }

}
