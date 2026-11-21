package praktika2;

import java.util.Comparator;

class Prak9Task2Student {
    private int id;
    private String name;
    private double gpa; // Итоговый балл

    public Prak9Task2Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', gpa=" + gpa + "}";
    }
}

class Prak9GpaComparator implements Comparator<Prak9Task2Student> {
    @Override
    public int compare(Prak9Task2Student s1, Prak9Task2Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}

class Prak9QuickSort {
    public static void sort(Prak9Task2Student[] arr, int low, int high, Comparator<Prak9Task2Student> comp) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high, comp);

            sort(arr, low, partitionIndex - 1, comp);
            sort(arr, partitionIndex + 1, high, comp);
        }
    }

    private static int partition(Prak9Task2Student[] arr, int low, int high, Comparator<Prak9Task2Student> comp) {
        Prak9Task2Student pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (comp.compare(arr[j], pivot) > 0) {
                i++;
                Prak9Task2Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Prak9Task2Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

public class Prak9Task2 {
    public static void main(String[] args) {
        Prak9Task2Student[] students = {
                new Prak9Task2Student(1, "Иванов", 3.5),
                new Prak9Task2Student(2, "Петров", 4.8),
                new Prak9Task2Student(3, "Сидоров", 4.2),
                new Prak9Task2Student(4, "Алексеев", 3.9),
                new Prak9Task2Student(5, "Смирнов", 4.9)
        };

        System.out.println("До сортировки:");
        for (Prak9Task2Student s : students) {
            System.out.println(s);
        }

        Prak9GpaComparator gpaComparator = new Prak9GpaComparator();
        Prak9QuickSort.sort(students, 0, students.length - 1, gpaComparator);

        System.out.println("\nПосле сортировки по GPA (убывание):");
        for (Prak9Task2Student s : students) {
            System.out.println(s);
        }
    }
}
