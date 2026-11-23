package praktika1;

interface Printable1 {
    void print();
}

class Book1 implements Printable {
    private String name;

    public Book1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Книга: \"" + name + "\"");
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("=== Список книг ===");
        for (Printable p : printable) {
            if (p instanceof Book1) {
                p.print();
            }
        }
    }
}

class Journal implements Printable {
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: \"" + name + "\"");
    }
}

public class PrintBooksTaskp7t8 {
    public static void main(String[] args) {
        Printable[] items = {
                new Book1("Война и мир"),
                new Journal("Хакер"),
                new Book1("Мастер и Маргарита"),
                new Journal("Игромания"),
                new Book1("Преступление и наказание")
        };

        System.out.println("--- Все элементы массива ---");
        for (Printable p : items) {
            p.print();
        }
        Book1.printBooks(items);
    }
}
