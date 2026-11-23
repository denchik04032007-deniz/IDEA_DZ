package praktika1;

import java.util.Scanner;

public class TestShopp2t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputReader input = new ConsoleInput(scanner);

        int capacity = input.readPositiveInt("Введите вместимость магазина: ");
        Shopp2t4 shop = new Shopp2t4(capacity);

        int computersToAdd = input.readPositiveInt("Сколько компьютеров добавить сразу? ");

        for (int i = 1; i <= computersToAdd; i++) {
            System.out.println("Компьютер №" + i);

            String name = input.readText("Введите название: ");
            int price = input.readPositiveInt("Введите цену: ");

            if (shop.addComputer(new Computer(name, price))) {
                System.out.println("Компьютер добавлен.");
            }
            else {
                System.out.println("Магазин заполнен, поэтому этот компьютер не добавлен.");
                break;
            }
        }

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - показать все компьютеры");
            System.out.println("2 - добавить компьютер");
            System.out.println("3 - удалить компьютер");
            System.out.println("4 - найти компьютер");
            System.out.println("5 - выход");

            int choice = input.readPositiveInt("Выберите действие: ");

            if (choice == 1) {
                shop.printAllComputers();
            }
            else if (choice == 2) {
                String name = input.readText("Введите название компьютера: ");
                int price = input.readPositiveInt("Введите цену: ");

                if (shop.addComputer(new Computer(name, price))) {
                    System.out.println("Компьютер добавлен.");
                }
                else {
                    System.out.println("Магазин заполнен.");
                }
            }
            else if (choice == 3) {
                String name = input.readText("Введите название компьютера для удаления: ");

                if (shop.removeComputer(name)) {
                    System.out.println("Компьютер удалён.");
                }
                else {
                    System.out.println("Компьютер не найден.");
                }
            }
            else if (choice == 4) {
                String name = input.readText("Введите название компьютера для поиска: ");
                Computer found = shop.findComputer(name);

                if (found != null) {
                    System.out.println("Найден: " + found);
                }
                else {
                    System.out.println("Компьютер не найден.");
                }
            }
            else if (choice == 5) {
                System.out.println("Программа завершена.");
                break;
            }
            else {
                System.out.println("Нет такого пункта меню. Введите число от 1 до 5.");
            }
        }
    }
}
