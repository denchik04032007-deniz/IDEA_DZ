package praktika1;

import java.util.Scanner;

public class HowManyp2t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        //Защита от пустого ввода
        while (true) {
            System.out.print("Введите текст: ");
            input = scanner.nextLine();

            if (!input.trim().isEmpty()) {
                break;
            }

            System.out.println("Вы ничего не ввели. Попробуйте ещё раз.");
        }

        String[] words = input.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);
        scanner.close();
    }
}
