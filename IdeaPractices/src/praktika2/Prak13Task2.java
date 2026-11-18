package praktika2;

public class Prak13Task2 {
    public static void main(String[] args) {
        Prak13Person p1 = new Prak13Person("Иванов", null, null);
        System.out.println(p1.getFIO());

        Prak13Person p2 = new Prak13Person("Петров", "Петр", null);
        System.out.println(p2.getFIO());

        Prak13Person p3 = new Prak13Person("Сидоров", "Сидор", "Сидорович");
        System.out.println(p3.getFIO());
    }
}

class Prak13Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Prak13Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    //Оптимизация через StringBuilder
    public String getFIO() {
        StringBuilder sb = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            sb.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            sb.append(" ").append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }
}