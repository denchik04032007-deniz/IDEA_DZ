package praktika3.practice9;

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