package praktika2;

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

public class Prak9Task1 {
    public static void main(String[] args) {
        Prak9Student[] students = {
                new Prak9Student(303, "Иван"),
                new Prak9Student(101, "Петр"),
                new Prak9Student(404, "Мария"),
                new Prak9Student(202, "Анна")
        };

        System.out.println("До сортировки:");
        for (Prak9Student s : students) {
            System.out.println(s);
        }

        Prak9InsertionSort.insertionSort(students);

        // Выводим после сортировки
        System.out.println("\nПосле сортировки по iDNumber:");
        for (Prak9Student s : students) {
            System.out.println(s);
        }
    }
}
