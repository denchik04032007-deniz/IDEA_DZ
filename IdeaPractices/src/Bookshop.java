interface Printable {
    void print();
}

class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + name);
    }

    public static void printBooks(Printable[] printableArray) {
        System.out.println("Вывод только КНИГ:");
        for (Printable p : printableArray) {
            if (p instanceof Book) {
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
        System.out.println("Журнал: " + name);
    }
}

public class Bookshop {
    public static void main(String[] args) {
        Printable[] catalog = {
                new Book("Война и мир"),
                new Journal("Хакер"),
                new Book("Отцы и дети"),
                new Journal("Популярная механика")
        };
        Book.printBooks(catalog);
    }
}