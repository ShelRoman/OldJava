package training.string;

import java.util.List;
import java.util.Map;

/**
 * Created by user on 29/11/2015.
 */
public class Runner {

    public static void main(String[] args) {
//        String test = "Take-make-Take-MaKe-rocket-maKE-cake-zet-zet-Take-Rock-Rocket";
        StringMeth str = new StringMeth("Dong-ding-dong");

        System.out.println(str.countLetters());

        System.out.println(str.equalsIgnoreCase("StrinG", "STriNG"));

        System.out.println(str.caseChanger(true));
        System.out.println(str.caseChanger(false));

        System.out.println(str.replaceWords("bla-bla-bla","bl", "dl"));

        List<Integer> list = str.getDongIndexes();
        for (int in : list) {
            System.out.println(in);
        }

        Map<String, Integer> map = str.getCloneWords();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey().toString();;
            Integer value = entry.getValue();
            System.out.println("Word: " + key + " times: " + value );
        }
    }
}
