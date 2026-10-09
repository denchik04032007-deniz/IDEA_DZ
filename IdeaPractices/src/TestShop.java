import java.util.ArrayList;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ МАГАЗИНА ===");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер по бренду");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выберите действие (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Введите бренд: ");
                String brand = scanner.nextLine();
                System.out.print("Введите модель: ");
                String model = scanner.nextLine();
                System.out.print("Введите цену: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Очистка буфера

                Computer comp = new Computer(brand, model, price);
                shop.addComputer(comp);

            } else if (choice == 2) {
                System.out.print("Введите бренд удаляемого ПК: ");
                String brand = scanner.nextLine();
                System.out.print("Введите модель удаляемого ПК: ");
                String model = scanner.nextLine();

                boolean deleted = shop.removeComputer(brand, model);
                if (deleted) {
                    System.out.println("Компьютер удален.");
                } else {
                    System.out.println("⚠Компьютер не найден в магазине.");
                }

            } else if (choice == 3) {
                System.out.print("Какой бренд ищем?: ");
                String searchBrand = scanner.nextLine();
                ArrayList<Computer> results = shop.findComputerByBrand(searchBrand);

                if (results.isEmpty()) {
                    System.out.println("Ничего не найдено.");
                } else {
                    System.out.println("Результаты поиска:");
                    for (Computer c : results) {
                        System.out.println(c);
                    }
                }

            } else if (choice == 4) {
                shop.printAllComputers();

            } else if (choice == 5) {
                System.out.println("Программа завершена. До свидания!");
                break;
            } else {
                System.out.println("Неверный пункт меню! Попробуйте снова.");
            }
        }

        scanner.close();
    }
}