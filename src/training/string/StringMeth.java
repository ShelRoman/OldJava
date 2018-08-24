/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author user
 */
public class StringMeth {
    private String mainString;

    public StringMeth(final String mainString) {
        this.mainString = mainString;
    }

    public int countLetters() {
        int result = 0;
        Pattern pt = Pattern.compile("\\w");
        Matcher mt;
        for (int i = 0; i < mainString.length(); i++) {
            String temp = mainString.substring(i, i + 1);
            mt = pt.matcher(temp);
            if (mt.matches()) {
                result++;
            }
        }
        return result;
    }

    public boolean equalsIgnoreCase(final String string1, final String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public String caseChanger(final boolean isUpperCase) {
        if (isUpperCase) {
            return mainString.toUpperCase();
        } else {
            return mainString.toLowerCase();
        }
    }

    public List<Integer> getDongIndexes() {
        String dong = "dong";
        String string = mainString.toLowerCase();
        List<Integer> indexList = new ArrayList<>();
        int index = 0;
        while ((index = string.indexOf(dong, index)) != -1) {
            indexList.add(index);
            index++;
        }
        return indexList;
    }

    public String replaceWords(final String stringToChange, final String replaceable, final String replaced) {
        return stringToChange.replaceAll(replaceable, replaced);
    }

    public Map<String, Integer> getCloneWords() {
        String words[] = mainString.split("-");
        Map<String, Integer> wordsStorage = new HashMap<>();
        for (String word : words) {
            if (!wordsStorage.containsKey(word.toLowerCase())) {
                wordsStorage.put(word.toLowerCase(), 1);
            } else {
                wordsStorage.replace(word.toLowerCase(), wordsStorage.get(word.toLowerCase()) + 1);
            }
        }
        return wordsStorage;
    }
}


