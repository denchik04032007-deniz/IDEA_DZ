public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иван Иванов", "ivan@example.com", 'm');

        System.out.println("Исходные данные:");
        System.out.println(author);

        author.setEmail("new_ivan@example.com");
        System.out.println("\nПосле изменения email:");
        System.out.println(author);

        System.out.println("\nПроверка отдельных геттеров:");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}