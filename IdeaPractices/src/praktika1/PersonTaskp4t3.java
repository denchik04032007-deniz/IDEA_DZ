package praktika1;

public class PersonTaskp4t3 {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setFullName("Денис");
        person1.setAge(18);

        Person person2 = new Person("Иван Иванов", 25);

        System.out.println("=== Первый объект ===");
        person1.talk();
        person1.move();

        System.out.println("\n=== Второй объект ===");
        person2.talk();
        person2.move();
    }
}

class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Без имени";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        setFullName(fullName);
        setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " идет.");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }
}
