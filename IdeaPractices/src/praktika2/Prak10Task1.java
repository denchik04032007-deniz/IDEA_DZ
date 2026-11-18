package praktika2;

public class Prak10Task1 {
    //Все переменные экземпляра
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;

    //Конструктор, включающий все переменные
    public Prak10Task1(String firstName, String lastName, String specialty, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
    }

    //Геттеры
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    //Сеттеры
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}