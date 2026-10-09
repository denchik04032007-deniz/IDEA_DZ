import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int cardsPerPlayer = 5;
        int totalCards = 52;

        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Введено не число!");
            return;
        }

        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество игроков должно быть больше 0.");
            return;
        } else if (n * cardsPerPlayer > totalCards) {
            System.out.println("Игроков слишком много! В колоде всего 52 карты.");
            return;
        }

        String[] deck = new String[totalCards];
        int count = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[count] = rank + " (" + suit + ")";
                count++;
            }
        }

        for (int i = 0; i < totalCards; i++) {
            int randomIndex = i + (int) (Math.random() * (totalCards - i));

            String temp = deck[randomIndex];
            deck[randomIndex] = deck[i];
            deck[i] = temp;
        }

        System.out.println("\n=== РЕЗУЛЬТАТ РАЗДАЧИ ===");
        int cardIndex = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println("  " + deck[cardIndex]);
                cardIndex++;
            }
            System.out.println();
        }

        scanner.close();
    }
}