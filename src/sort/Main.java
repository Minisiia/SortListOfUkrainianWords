package sort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("борщ");
        words.add("голубці");
        words.add("ікра");
        words.add("пиріг");
        words.add("їжак");
        Collections.sort(words);
        System.out.println("Sorted words:");
        for (String word : words) {
            System.out.println(word);
        }

        Collator collator = Collator.getInstance(new Locale("uk", "UA"));
        words.sort(collator);

        System.out.println("\nSorted words with Collator:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
