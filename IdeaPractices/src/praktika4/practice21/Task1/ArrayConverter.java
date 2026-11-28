package praktika4.practice21.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConverter {

    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static <T> List<T> arrayToListShort(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"Иван", "Петр", "Сидор"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("Массив строк: " + Arrays.toString(stringArray));
        System.out.println("Список строк: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("\nМассив чисел: " + Arrays.toString(intArray));
        System.out.println("Список чисел: " + intList);

        Double[] doubleArray = {1.1, 2.2, 3.3};
        List<Double> doubleList = arrayToListShort(doubleArray);
        System.out.println("\nМассив дробных: " + Arrays.toString(doubleArray));
        System.out.println("Список дробных: " + doubleList);
    }
}
