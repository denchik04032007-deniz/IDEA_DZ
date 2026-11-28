package praktika3.practice17.Task2;

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
