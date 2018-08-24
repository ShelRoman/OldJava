package training.eugene.string;

import static training.eugene.string.StringTask.baseString;
import static training.eugene.string.StringTask.fifthTaskWordsAmount;
import static training.eugene.string.StringTask.firstTask;
import static training.eugene.string.StringTask.fourthTaskIndex;
import static training.eugene.string.StringTask.secondTaskEquallityIgnotingCaes;
import static training.eugene.string.StringTask.thirdTaskLowerCase;
import static training.eugene.string.StringTask.thirdTaskUpperCase;


/**
 *
 * @author evgeniy gerasimenko
 */
public class Runner {
    public static void main(String[] args) {
        String otherString = "dong-ding-dong";
        System.out.println("length of 'Dong-ding-dong':" + firstTask(baseString));
        System.out.println("length of 'Dong-ding-dong' second variant:" + firstTask(baseString));
        System.out.println("equality of 'Dong-ding-dong' with " + otherString + " if ignore register:" + secondTaskEquallityIgnotingCaes(baseString, otherString));
        System.out.println("lower case of " + baseString + ": " + thirdTaskLowerCase(baseString));
        System.out.println("upper case of " + baseString + ": " + thirdTaskUpperCase(baseString));
        System.out.println("all indexes of 'dong' in Dong-ding-dong':");
        System.out.println(fourthTaskIndex(baseString, "dong"));
        System.out.println("amount of words in string:");
        System.out.println(fifthTaskWordsAmount(baseString));
    }
}
