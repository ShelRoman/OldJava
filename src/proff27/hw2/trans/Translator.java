package proff27.hw2.trans;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Translator {

    public String translate(Reader text, Reader dict) throws IOException {
        Map<String, String> dictionary = processDict(dict);
        List<String> textIn = processText(text);
        return translate(textIn, dictionary);
    }

    private String translate(List<String> textIn, Map<String, String> dictionary) {
        for (int i = 0; i < textIn.size(); i++) {
            textIn.set(i, dictionary.get(textIn.get(i)));
        }
        return textIn.toString();
    }

    private ArrayList<String> processText(Reader text) {
        Scanner scan = new Scanner(text);
        ArrayList<String> inputText = new ArrayList<>();
        while (scan.hasNext()) {
            inputText.add(scan.next());
        }
        return inputText;
    }

    private HashMap<String, String> processDict(Reader dict) {
        Scanner scan = new Scanner(dict);
        List<String> inputText = new ArrayList<>();
        while (scan.hasNextLine()) {
            inputText.add(scan.nextLine());
        }
        return splitDict(inputText);
    }

    private HashMap<String, String> splitDict(List<String> dictList) {
        HashMap<String, String> dictionary = new HashMap<>();
        for (String pair : dictList) {
            dictionary.put(pair.split("=", 2)[0], pair.split("=", 2)[1]);
        }
        return dictionary;
    }

    public static void main(String[] args) throws IOException {
        Reader text = new FileReader("D:\\Java\\Proff27\\roman_sheludko\\text.txt");
        Reader dict = new FileReader("D:\\Java\\Proff27\\roman_sheludko\\dict.txt");
        Translator trans = new Translator();
        System.out.println(trans.translate(text, dict));
    }
}
