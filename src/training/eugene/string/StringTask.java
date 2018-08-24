package training.eugene.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author evgeniy gerasimenko
 */
public class StringTask {
    public static final String baseString = "Dong-ding-dong";

    public static int firstTask(String string) {
        int length = 0;
        Pattern p3 = Pattern.compile("\\W");
        String[] words = p3.split(string);
        for (String word : words)
            length = length + word.length();
        return length;
    }

    public static int firstTaskSecondVariant(String string) {
        return string.replace("-", "").length();
    }

    public static boolean secondTaskEquallityIgnotingCaes(String string, String otherString) {
        return string.equalsIgnoreCase(otherString);
    }

    public static String thirdTaskUpperCase(String string) {
        return string.toUpperCase();
    }

    public static String thirdTaskLowerCase(String string) {
        return string.toLowerCase();
    }

    public static ArrayList fourthTaskIndex(String string, String dong) {
        int start = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (string.indexOf(dong, start) != -1) {
            list.add(string.toLowerCase().indexOf(dong, start));
            start = string.toLowerCase().indexOf(dong, start) + dong.length();
        }
        return list;
    }

    public static Map fifthTaskWordsAmount(String string) {
        Map<String, Integer> hashMap = new HashMap<>();
        Pattern p3 = Pattern.compile("\\W");
        String[] words = p3.split(string);
        for (String word : words) {
            if (hashMap.containsKey(word.toLowerCase())) {
                hashMap.put(word, hashMap.get(word.toLowerCase()) + 1);
            } else {
                hashMap.put(word.toLowerCase(), 1);
            }
        }
        return hashMap;
    }
}
