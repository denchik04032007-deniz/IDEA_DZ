package praktika3.practice17.Task2;

import java.util.Scanner;

public class Prak17Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("\n--- МЕНЮ (двухсвязный список) ---");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить по индексу");
            System.out.println("3. Вывести список");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить на пустоту");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Student2 s = new Student2();
                    s.readFromConsole(sc);
                    list.add(s);
                    break;
                case 2:
                    System.out.print("Индекс для удаления: ");
                    int index = sc.nextInt();
                    list.remove(index);
                    break;
                case 3:
                    list.print();
                    break;
                case 4:
                    list.clear();
                    System.out.println("Список очищен");
                    break;
                case 5:
                    System.out.println(list.isEmpty() ? "Список пуст" : "Список не пуст");
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}