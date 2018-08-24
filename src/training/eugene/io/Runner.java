package training.eugene.io;

import java.io.File;

/**
 *
 * @author evgeniy gerasimenko
 */
public class Runner {
    public static void main(String[] args)  {

        File fileOne = new File("test1.txt");
        File fileTwo = new File("test2.txt");

        IOHomeWork iOHomeWork = new IOHomeWork(fileOne, fileTwo, false);
        System.out.println("Task one:");
        System.out.println("Result of comparing " + fileOne.getName() + " with " + fileTwo.getName() + ":" );
        if (iOHomeWork.isEqual()) {
            System.out.println("differences were not found");
        } else {
            System.out.println("length of files: " + "file one - " + fileOne.length() + ", file two - " + fileTwo.length());
            if (iOHomeWork.getFirstDifference() == -1) {
                System.out.println("difference in size of files");
            } else {
                System.out.println("first difference in " + iOHomeWork.getFirstDifference() + " byte");
            }
            System.out.println("all amount of differences:" + iOHomeWork.getAmountDifference());
        }
        IOHomeWork iOHomeWork2 = new IOHomeWork(fileOne, fileTwo, true);
        System.out.println("Task two:");
        System.out.println("Result of comparing " + fileOne.getName() + " with " + fileTwo.getName() + ":" );
        if (iOHomeWork2.isEqual()) {
            System.out.println("differences were not found");
        } else {
            System.out.println("length of files: " + "file one - " + fileOne.length() + ", file two - " + fileTwo.length());
            if (iOHomeWork2.getFirstDifference() == -1) {
                System.out.println("difference in size of files");
            } else {
                System.out.println("first difference in " + iOHomeWork2.getFirstDifference() + " byte");
            }
            System.out.println("all amount of differences:" + iOHomeWork2.getAmountDifference());
        }

    }
}