package praktika3.practice9;

public class Prak9Task3for17 {
    public static void main(String[] args) {
        Node3 list1 = new Node3(new Student3("Анна", 18));
        list1.next = new Node3(new Student3("Борис", 20));
        list1.next.next = new Node3(new Student3("Виктор", 22));

        Node3 list2 = new Node3(new Student3("Галина", 19));
        list2.next = new Node3(new Student3("Дмитрий", 21));
        list2.next.next = new Node3(new Student3("Елена", 23));

        System.out.println("--- Список 1 (отсортирован) ---");
        MergeList.print(list1);

        System.out.println("\n--- Список 2 (отсортирован) ---");
        MergeList.print(list2);

        Node3 merged = MergeList.merge(list1, list2);

        System.out.println("\n--- Результат слияния ---");
        MergeList.print(merged);
    }
}