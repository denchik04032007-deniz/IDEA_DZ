package praktika3;

class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class Node3 {
    Student3 data;
    Node3 next;

    Node3(Student3 data) {
        this.data = data;
        this.next = null;
    }
}

class MergeList {
    static Node3 merge(Node3 a, Node3 b) {
        if (a == null) return b;
        if (b == null) return a;

        Node3 head;
        Node3 tail;

        if (a.data.age <= b.data.age) {
            head = a;
            a = a.next;
        }
        else {
            head = b;
            b = b.next;
        }
        tail = head;

        while (a != null && b != null) {
            if (a.data.age <= b.data.age) {
                tail.next = a;
                a = a.next;
            }
            else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        }
        else {
            tail.next = b;
        }

        return head;
    }

    static void print(Node3 head) {
        Node3 current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "] ");
            current.data.print();
            current = current.next;
            i++;
        }
    }
}

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