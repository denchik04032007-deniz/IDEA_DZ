package praktika4.practice19.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class LabClass implements LabClassUI {
    private Student[] students;
    private int count;

    public LabClass(int capacity) {
        students = new Student[capacity];
        count = 0;
    }

    @Override
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
        else {
            System.out.println("Массив заполнен!");
        }
    }

    @Override
    public void sortByAverageScore() {
        Arrays.sort(students, 0, count, Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("Студенты отсортированы по среднему баллу");
    }

    @Override
    public Student findByFio(String fio) throws StudentNotFoundException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new StudentNotFoundException("ФИО для поиска не может быть пустым");
        }

        for (int i = 0; i < count; i++) {
            if (students[i].getFio().equalsIgnoreCase(fio.trim())) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fio + "' не найден");
    }

    @Override
    public void printAllStudents() {
        if (count == 0) {
            System.out.println("Список студентов пуст");
            return;
        }

        System.out.println("=== Список студентов ===");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        System.out.println("========================");
    }
}
