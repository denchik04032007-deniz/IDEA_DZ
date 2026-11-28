package praktika4.practice21.Task2;

public class ArrayUtils {
    public static <T> T getElement(T[] array, int index) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException(
                    "Индекс " + index + " выходит за пределы массива длиной " + array.length
            );
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] strings = {"Яблоко", "Банан", "Апельсин"};
        Integer[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Строка по индексу 1: " + getElement(strings, 1));
        System.out.println("Число по индексу 3: " + getElement(numbers, 3));
    }
}
