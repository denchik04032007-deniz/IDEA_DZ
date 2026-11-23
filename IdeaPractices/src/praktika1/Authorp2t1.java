package praktika1;

public class Authorp2t1 {
    private String name;
    private String email;
    private char gender;

    public Authorp2t1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "praktika1.Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
class TestAuthor {
    public static void main(String[] args) {
        Authorp2t1 author = new Authorp2t1("Демидов Глеб", "Gleb123@example.com", 'm');

        System.out.println("Исходные данные:");
        System.out.println(author);

        author.setEmail("new_gleb@example.com");
        System.out.println("\nПосле изменения email:");
        System.out.println(author);

        System.out.println("\nПроверка отдельных геттеров:");
        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}