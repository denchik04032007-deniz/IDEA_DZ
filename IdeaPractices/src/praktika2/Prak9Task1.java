package praktika2;

// Класс Student с уникальным именем
class Prak9Student {
    private int iDNumber;
    private String name;

    public Prak9Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Prak9Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

// Класс сортировки с уникальным именем
class Prak9InsertionSort {
    public static void insertionSort(Prak9Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Prak9Student toInsert = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > toInsert.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = toInsert;
        }
    }
}

// Главный класс с уникальным именем (файл должен называться Prak9Task1.java)
public class Prak9Task1 {
    public static void main(String[] args) {
        // Создаем массив студентов в случайном порядке
        Prak9Student[] students = {
                new Prak9Student(303, "Иван"),
                new Prak9Student(101, "Петр"),
                new Prak9Student(404, "Мария"),
                new Prak9Student(202, "Анна")
        };

        // Выводим до сортировки
        System.out.println("До сортировки:");
        for (Prak9Student s : students) {
            System.out.println(s);
        }

        // Вызываем сортировку вставками
        Prak9InsertionSort.insertionSort(students);

        // Выводим после сортировки
        System.out.println("\nПосле сортировки по iDNumber:");
        for (Prak9Student s : students) {
            System.out.println(s);
        }
    }
}
