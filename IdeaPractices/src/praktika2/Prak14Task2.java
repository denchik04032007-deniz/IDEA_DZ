package praktika2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Prak14Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.print("Введите строку для проверки: ");
        String input = scanner.nextLine();

        if (Pattern.matches(regex, input)) {
            System.out.println("Строка совпадает с образцом!");
        }
        else {
            System.out.println("Строка НЕ совпадает с образцом.");
        }
    }
}
