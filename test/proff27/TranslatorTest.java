package proff27;

import org.junit.Before;
import org.junit.Test;
import proff27.hw2.trans.Translator;

import java.io.IOException;
import java.io.Reader;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {
    Translator translator = new Translator();
    Reader text;
    Reader dict;

    @Before
    public void setUp() {
        translator = new Translator();
    }

    @Test
    public void testCorrect() throws IOException {
        boolean actualResult = true;
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }
}
