package training.me;

import training.string.StringMeth;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/11/2015.
 */
public class StringMethTest {

    private StringMeth module;

    @Before
    public void setUp() {
        module = new StringMeth("Dong-ding-dong");
    }

    @Test
    public void testCountLetters() {
        int expResult = 12;
        int result = module.countLetters();
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsIgnoreCase() {
        boolean expResult = true;
        boolean result = module.equalsIgnoreCase("StRinG", "STRING");
        assertEquals(expResult, result);
    }

    @Test
    public void testCaseChangerUpper() {
        String expResult = "DONG-DING-DONG";
        String result = module.caseChanger(true);
        assertEquals(expResult, result);
    }

    @Test
    public void testCaseChangerLower() {
        String expResult = "dong-ding-dong";
        String result = module.caseChanger(false);
        assertEquals(expResult, result);
    }

    @Test
    public void testReplaceWords() {
        String expResult = "dla-dla-dla";
        String result = module.replaceWords("bla-bla-bla", "bl", "dl");
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDongIndexes() {
        List<Integer> expResult = new ArrayList<>();
        expResult.add(0);
        expResult.add(10);
        List<Integer> result = module.getDongIndexes();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCloneWords() {
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("dong", 2);
        expResult.put("ding", 1);
        Map<String, Integer> result = module.getCloneWords();
        assertEquals(expResult, result);
    }


}
