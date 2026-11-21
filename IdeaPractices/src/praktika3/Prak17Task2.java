package praktika3;

import java.util.Scanner;

class Student2 {
    String name;
    int age;

    void readFromConsole(Scanner sc) {
        System.out.print("Введите имя: ");
        name = sc.nextLine();
        System.out.print("Введите возраст: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    void print() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class DNode {
    Student2 data;
    DNode next;
    DNode prev;

    DNode(Student2 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

//Контейнерный класс
class DoublyLinkedList {
    private DNode head;
    private DNode tail;

    //Добавление элемента в конец
    void add(Student2 student) {
        DNode newNode = new DNode(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //Удаление элемента по индексу
    void remove(int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }

        DNode current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Неверный индекс!");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        else {
            tail = current.prev;
        }
    }

    //Вывод всего списка
    void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        DNode current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "] ");
            current.data.print();
            current = current.next;
            i++;
        }
    }

    //Очистка списка
    void clear() {
        head = null;
        tail = null;
    }

    //Проверка на пустоту
    boolean isEmpty() {
        return head == null;
    }
}

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