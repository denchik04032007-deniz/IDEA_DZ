package praktika1;

interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Книга: \"" + title + "\", автор: " + author);
    }
}

public class PrintableBookTaskp6t67 {
    public static void main(String[] args) {
        Printable book1 = new Book("Война и мир", "Лев Толстой");
        Printable book2 = new Book("Мастер и Маргарита", "Михаил Булгаков");

        book1.print();
        book2.print();
    }
}
