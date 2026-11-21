package praktika3;

import java.util.Scanner;

class Student {
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

class Node {
    Student data;
    Node next;

    Node(Student data) {
        this.data = data;
        this.next = null;
    }
}

//Контейнерный класс
class LinkedList {
    private Node head;

    //Функция добавления элемента в конец списка
    void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Функция удаления элемента из списка по индексу
    void remove(int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        else {
            System.out.println("Неверный индекс!");
        }
    }

    //Функция вывода всего списка на экран
    void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "] ");
            current.data.print();
            current = current.next;
            i++;
        }
    }

    //Функция очистки списка
    void clear() {
        head = null;
    }

    //Функция проверки списка на пустоту
    boolean isEmpty() {
        return head == null;
    }
}

public class Prak17Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            System.out.println("\n--- МЕНЮ (односвязный список) ---");
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
                    Student s = new Student();
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