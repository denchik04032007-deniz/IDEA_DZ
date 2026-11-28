package praktika3.practice17.Task1;

//Контейнерный класс
class LinkedList {
    private Node head;

    //Функция добавления элемента в конец списка
    void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    //Функция удаления элемента из списка по индексу
    void remove(int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        else {
            System.out.println("Неверный индекс!");
        }
    }

    //Функция вывода всего списка на экран
    void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "] ");
            current.data.print();
            current = current.next;
            i++;
        }
    }

    //Функция очистки списка
    void clear() {
        head = null;
    }

    //Функция проверки списка на пустоту
    boolean isEmpty() {
        return head == null;
    }
}
