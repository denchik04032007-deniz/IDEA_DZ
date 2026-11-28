package praktika3.practice17.Task2;

//Контейнерный класс
class DoublyLinkedList {
    private DNode head;
    private DNode tail;

    //Добавление элемента в конец
    void add(Student2 student) {
        DNode newNode = new DNode(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //Удаление элемента по индексу
    void remove(int index) {
        if (head == null) {
            System.out.println("Список пуст!");
            return;
        }

        DNode current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Неверный индекс!");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        else {
            tail = current.prev;
        }
    }

    //Вывод всего списка
    void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        DNode current = head;
        int i = 0;
        while (current != null) {
            System.out.print("[" + i + "] ");
            current.data.print();
            current = current.next;
            i++;
        }
    }

    //Очистка списка
    void clear() {
        head = null;
        tail = null;
    }

    //Проверка на пустоту
    boolean isEmpty() {
        return head == null;
    }
}
