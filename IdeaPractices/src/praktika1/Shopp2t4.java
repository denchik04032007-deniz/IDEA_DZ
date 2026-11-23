package praktika1;

import java.util.Scanner;

interface ShopService {
    boolean addComputer(Computer computer);
    boolean removeComputer(String name);
    Computer findComputer(String name);
    void printAllComputers();
}

interface InputReader {
    String readText(String prompt);
    int readPositiveInt(String prompt);
}

class Computer {
    private String name;
    private int price;

    public Computer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Компьютер: " + name + ", цена: " + price;
    }
}

class ConsoleInput implements InputReader {
    private Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String text = scanner.nextLine().trim();

            if (!text.isEmpty()) {
                return text;
            }

            System.out.println("Ввод не может быть пустым. Попробуйте ещё раз.");
        }
    }

    public int readPositiveInt(String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();

                if (value > 0) {
                    return value;
                }

                System.out.println("Число должно быть больше нуля.");
            } else {
                System.out.println("Нужно ввести целое число, а не текст.");
                scanner.nextLine();
            }
        }
    }
}

public class Shopp2t4 implements ShopService {
    private Computer[] computers;
    private int count;

    public Shopp2t4(int capacity) {
        if (capacity <= 0) {
            capacity = 1;
        }

        computers = new Computer[capacity];
        count = 0;
    }

    public boolean addComputer(Computer computer) {
        if (count >= computers.length) {
            return false;
        }

        computers[count] = computer;
        count++;
        return true;
    }

    public boolean removeComputer(String name) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    computers[j] = computers[j + 1];
                }

                computers[count - 1] = null;
                count--;
                return true;
            }
        }

        return false;
    }

    public Computer findComputer(String name) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getName().equalsIgnoreCase(name)) {
                return computers[i];
            }
        }

        return null;
    }

    public void printAllComputers() {
        if (count == 0) {
            System.out.println("Магазин пуст.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + computers[i]);
        }
    }
}