package training.eugene.io;

import java.io.*;

/**
 * @author evgeniy gerasimenko
 */
public class IOHomeWork {
    private int firstDifference = -1; //number of byte where first difference was found
    private long amountDifference = 0; // amount of differences after comparing two files
    private boolean isEqual = true; // Is two files equal?

    // Compare two files, save position of first difference, calculate amount of differences, can do it in UNICODE format
    public IOHomeWork(File fileOne, File fileTwo, boolean unicode) {
        int i = 0;
        int bOne = 0;
        int bTwo = 0;
        InputStreamReader isOne;
        InputStreamReader isTwo;
        try {
            if (unicode) {
                isOne = new InputStreamReader(new FileInputStream(fileOne), "UNICODE");
                isTwo = new InputStreamReader(new FileInputStream(fileTwo), "UNICODE");
            } else {
                isOne = new FileReader(fileOne);
                isTwo = new FileReader(fileTwo);
            }
            while ((bOne = isOne.read()) != -1 | (bTwo = isTwo.read()) != -1) {
                if (bOne != bTwo) {
                    if (isEqual && bOne != -1 && bTwo != -1) {
                        firstDifference = i;
                    }
                    isEqual = false;
                    if (bOne != -1 && bTwo != -1) {
                        amountDifference++;
                    }
                }
                i++;
            }
            if (bOne == -1 || bTwo == -1) {
                amountDifference = amountDifference + Math.abs(fileOne.length() - fileTwo.length());
            }
            isOne.close();
            isTwo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int getFirstDifference() {
        return firstDifference;
    }

    public long getAmountDifference() {
        return amountDifference;
    }

    public boolean isEqual() {
        return isEqual;
    }

}
