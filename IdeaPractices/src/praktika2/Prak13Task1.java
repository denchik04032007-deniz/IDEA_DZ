package praktika2;

public class Prak13Task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        System.out.println("1. Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("2. Заканчивается на '!!!': " + str.endsWith("!!!"));
        System.out.println("3. Начинается с 'I like': " + str.startsWith("I like"));
        System.out.println("4. Содержит 'Java': " + str.contains("Java"));
        System.out.println("5. Позиция 'Java': " + str.indexOf("Java"));
        System.out.println("6. Замена 'a' на 'o': " + str.replace('a', 'o'));
        System.out.println("7. Верхний регистр: " + str.toUpperCase());
        System.out.println("8. Нижний регистр: " + str.toLowerCase());
        System.out.println("9. Вырезать 'Java': " + str.substring(7, 11));
    }
}
