package praktika2;

public class Prak10Task3 {
    public static void main(String[] args) {
        Prak10Student3[] list1 = {
                new Prak10Student3(101, "Иванов", "ИВТ", 2, "ИВТ-201"),
                new Prak10Student3(205, "Петров", "ИВТ", 3, "ИВТ-301"),
                new Prak10Student3(310, "Сидоров", "ПИ", 1, "ПИ-101")
        };
        Prak10Student3[] list2 = {
                new Prak10Student3(150, "Алексеев", "ПИ", 2, "ПИ-201"),
                new Prak10Student3(220, "Смирнов", "ИВТ", 4, "ИВТ-401"),
                new Prak10Student3(280, "Кузнецов", "ПИ", 1, "ПИ-101"),
                new Prak10Student3(400, "Попов", "ИВТ", 3, "ИВТ-301")
        };

        System.out.println("Первый список:");
        printArray(list1);

        System.out.println("\nВторой список:");
        printArray(list2);

        //Объединяем два списка в один отсортированный
        Prak10Student3[] merged = merge(list1, list2);

        System.out.println("\nОбъединенный отсортированный список:");
        printArray(merged);
    }
    public static Prak10Student3[] merge(Prak10Student3[] a, Prak10Student3[] b) {
        Prak10Student3[] result = new Prak10Student3[a.length + b.length];
        int i = 0; //указатель для первого массива
        int j = 0; //указатель для второго массива
        int k = 0; //указатель для результирующего массива

        while (i < a.length && j < b.length) {
            if (a[i].getID() <= b[j].getID()) {
                result[k] = a[i];
                i++;
            }
            else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }

    public static void printArray(Prak10Student3[] arr) {
        for (Prak10Student3 s : arr) {
            System.out.println(s);
        }
    }
}

class Prak10Student3 {
    private int id;
    private String lastName;
    private String specialty;
    private int course;
    private String group;

    public Prak10Student3(int id, String lastName, String specialty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", " + lastName + ", " + specialty + ", курс " + course + ", " + group;
    }
}