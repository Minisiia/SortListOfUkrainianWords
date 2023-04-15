package sort;

import java.text.Collator;
import java.util.*;

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
        Locale locale = new Locale("uk", "UA","traditional"); // Язык - украинский

        Collator collator = Collator.getInstance(locale);
        words.sort(collator);

        System.out.println("\nSorted words with Collator:");
        for (String word : words) {
            System.out.println(word);
        }

        Locale defaultLocale = Locale.getDefault(); // Получение текущей локали системы
        System.out.println("defaultLocale: " + defaultLocale);
        Locale[] supportedLocales = Locale.getAvailableLocales(); // Получение массива поддерживаемых локалей
        System.out.println("supportedLocales: " + Arrays.toString(supportedLocales));
        String displayName = locale.getDisplayName(); // Получение отображаемого имени локали
        System.out.println("displayName: " + displayName);
        String language = locale.getLanguage(); // Получение кода языка
        System.out.println("language: " + language);
        String country = locale.getCountry(); // Получение кода страны
        System.out.println("country: " + country);
        String variant = locale.getVariant(); // Получение кода варианта языка
        System.out.println("variant: " + variant);
    }
}
