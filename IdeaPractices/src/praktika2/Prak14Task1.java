package praktika2;

import java.util.regex.Pattern;

public class Prak14Task1 {
    public static void main(String[] args) {
        String text = "Java, Python; C++  Ruby|JavaScript, Go";

        String regex = "[,;\\s|]+";

        String[] words = Pattern.compile(regex).split(text);

        System.out.println("Исходная строка: " + text);
        System.out.println("\nРазбитые элементы:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
