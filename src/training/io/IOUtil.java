package training.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 22/11/2015.
 */
public class IOUtil {
    private InputStreamReader stream1;
    private InputStreamReader stream2;
    private File file1;
    private File file2;
    private boolean isUnicode;
    private int byte1;
    private int byte2;
    private boolean isEquals;
    private int firstDiffIndex;
    private int diffBytesCount;

    public IOUtil(final File file1, final File file2, final boolean isUnicode) {
        this.file1 = file1;
        this.file2 = file2;
        this.isUnicode = isUnicode;
        isEquals = true;
        firstDiffIndex = -1;
        diffBytesCount = 0;
    }

    public void compareFiles() {
        createStreams(file1, file2, isUnicode);
        int i = 0;
        try {
            while (((byte2 = stream2.read()) != -1 | (byte1 = stream1.read()) != -1)) {
                if (byte1 != byte2) {
                    if (isEquals()) {
                        isEquals = false;
                        firstDiffIndex = i;
                        diffBytesCount = getDiffBytesCount() + 1;
                    } else {
                        diffBytesCount = getDiffBytesCount() + 1;
                    }
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream1.close();
                stream2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        printResults();
    }

    private void createStreams(final File file1, final File file2, final boolean isUnicode) {
        try {
            if (isUnicode) {
                stream1 = new InputStreamReader(new FileInputStream(file1), "UNICODE");
                stream2 = new InputStreamReader(new FileInputStream(file2), "UNICODE");
            } else {
                stream1 = new InputStreamReader(new FileInputStream(file1));
                stream2 = new InputStreamReader(new FileInputStream(file2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printResults() {
        System.out.println("Results of comparing files: " + file1.getName() + " and " + file2.getName());
        if (isEquals()) {
            System.out.println("Files are identical, congratulations!");
        } else {
            System.out.println("Files are different:");
            System.out.println("Files size are: " + file1.getName() + " - " + file1.length() + " byte(s) " +
                    file2.getName() + " - " + file2.length() + " byte(s)");
            System.out.println("First difference was found on the " + getFirstDiffIndex() + " byte");
            System.out.println("Sum of different bytes: " + getDiffBytesCount());
        }
    }

    public boolean isEquals() {
        return isEquals;
    }

    public int getFirstDiffIndex() {
        return firstDiffIndex;
    }

    public int getDiffBytesCount() {
        return diffBytesCount;
    }
}
