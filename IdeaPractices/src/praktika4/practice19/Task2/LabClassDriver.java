package praktika4.practice19.Task2;

import java.util.Scanner;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClassUI[] labClasses = new LabClassUI[2];

        labClasses[0] = new LabClass(5);
        labClasses[1] = new LabClass(5);

        try {
            labClasses[0].addStudent(new Student("Иванов Иван Иванович", 4.5));
            labClasses[0].addStudent(new Student("Петров Петр Петрович", 3.8));
            labClasses[0].addStudent(new Student("Сидоров Сидор Сидорович", 4.9));

            labClasses[1].addStudent(new Student("Смирнова Анна Ивановна", 4.2));
            labClasses[1].addStudent(new Student("Кузнецов Алексей Петрович", 3.5));

            for (int i = 0; i < labClasses.length; i++) {
                System.out.println("\n=== Группа " + (i + 1) + " ===");
                labClasses[i].printAllStudents();
                labClasses[i].sortByAverageScore();
                labClasses[i].printAllStudents();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nВведите ФИО студента для поиска: ");
            String searchFio = scanner.nextLine();

            boolean found = false;

            for (int i = 0; i < labClasses.length; i++) {
                try {
                    Student foundStudent = labClasses[i].findByFio(searchFio);
                    System.out.println("Найден в группе " + (i + 1) + ": " + foundStudent);
                    found = true;
                    break;
                }
                catch (StudentNotFoundException e) {
                    continue;
                }
            }

            if (!found) {
                System.out.println("Ошибка: Студент с ФИО '" + searchFio + "' не найден ни в одной группе");
            }
        }
        catch (EmptyStringException e) {
            System.out.println("Ошибка при создании студента: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        }
    }
}
