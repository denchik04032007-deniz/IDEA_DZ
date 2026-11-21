package praktika2;

import java.text.SimpleDateFormat;
import java.util.Date;

class Prak11Student {
    private String name;
    private String surname;
    private Date birthDate; // Поле для хранения даты рождения

    public Prak11Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getBirthDateFormatted(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Студент: " + surname + " " + name + ", Дата рождения: " + sdf.format(birthDate);
    }
}

public class Prak11Task3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date dob = sdf.parse("04.03.2007");

            Prak11Student student = new Prak11Student("Денис", "Хамидуллин", dob);

            System.out.println("Вывод через toString():");
            System.out.println(student);

            System.out.println("\nВывод через метод:");

            System.out.println("Короткий: " + student.getBirthDateFormatted("dd/MM/yy"));

            System.out.println("Средний: " + student.getBirthDateFormatted("dd MMM yyyy"));

            System.out.println("Полный: " + student.getBirthDateFormatted("EEEE, d MMMM yyyy 'года'"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
