import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== КОНВЕРТЕР ВАЛЮТ ===");
            System.out.println("1. Перевести иностранную валюту в рубли");
            System.out.println("2. Перевести рубли в иностранную валюту");
            System.out.println("3. Выход");
            System.out.print("Выберите действие (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Введите валюту (USD, EUR, CNY): ");
                String currency = scanner.nextLine();
                System.out.print("Введите сумму: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                converter.convertToRub(amount, currency);

            } else if (choice == 2) {
                System.out.print("Введите целевую валюту (USD, EUR, CNY): ");
                String targetCurrency = scanner.nextLine();
                System.out.print("Введите сумму в рублях: ");
                double rubAmount = scanner.nextDouble();
                scanner.nextLine();

                converter.convertFromRub(rubAmount, targetCurrency);

            } else if (choice == 3) {
                System.out.println("Работа завершена. До свидания!");
                break;
            } else {
                System.out.println("Неверный пункт меню!");
            }
        }
        scanner.close();
    }
}