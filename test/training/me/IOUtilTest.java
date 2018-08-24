package training.me;

import training.io.IOUtil;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29/11/2015.
 */
public class IOUtilTest {

    private IOUtil moduleIdent;
    private IOUtil moduleDiff;
    private IOUtil moduleIdentUnicode;
    private IOUtil moduleDiffUnicode;

    @Before
    public void setUp() {
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        moduleIdent = new IOUtil(file1, file2, false);
        moduleDiff = new IOUtil(file1, file3, false);
        moduleIdentUnicode = new IOUtil(file1, file2, true);
        moduleDiffUnicode = new IOUtil(file1, file3, true);
    }

    @Test
    public void testIdentFiles() {
        boolean expResult = true;
        moduleIdent.compareFiles();
        boolean result = moduleIdent.isEquals();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentFilesFirstDiffIndex() {
        int expResult = -1;
        moduleIdent.compareFiles();
        int result = moduleIdent.getFirstDiffIndex();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentFilesDiffBytesCount() {
        int expResult = 0;
        moduleIdent.compareFiles();
        int result = moduleIdent.getDiffBytesCount();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFiles() {
        boolean expResult = false;
        moduleDiff.compareFiles();
        boolean result = moduleDiff.isEquals();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFilesFirstDiffIndex() {
        int expResult = 16;
        moduleDiff.compareFiles();
        int result = moduleDiff.getFirstDiffIndex();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFilesDiffBytesCount() {
        int expResult = 8;
        moduleDiff.compareFiles();
        int result = moduleDiff.getDiffBytesCount();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentFilesUnicode() {
        boolean expResult = true;
        moduleIdentUnicode.compareFiles();
        boolean result = moduleIdentUnicode.isEquals();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentFilesUnicodeFirstDiffIndex() {
        int expResult = -1;
        moduleIdentUnicode.compareFiles();
        int result = moduleIdentUnicode.getFirstDiffIndex();
        assertEquals(expResult, result);
    }

    @Test
    public void testIdentFilesUnicodeDiffBytesCount() {
        int expResult = 0;
        moduleIdentUnicode.compareFiles();
        int result = moduleIdentUnicode.getDiffBytesCount();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFilesUnicode() {
        boolean expResult = false;
        moduleDiffUnicode.compareFiles();
        boolean result = moduleDiffUnicode.isEquals();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFilesUnicodeFirstDiffIndex() {
        int expResult = 8;
        moduleDiffUnicode.compareFiles();
        int result = moduleDiffUnicode.getFirstDiffIndex();
        assertEquals(expResult, result);
    }

    @Test
    public void testDiffFilesUnicodeDiffBytesCount() {
        int expResult = 4;
        moduleDiffUnicode.compareFiles();
        int result = moduleDiffUnicode.getDiffBytesCount();
        assertEquals(expResult, result);
    }

}
