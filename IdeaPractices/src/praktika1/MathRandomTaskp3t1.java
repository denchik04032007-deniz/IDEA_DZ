package praktika1;

import java.util.Arrays;
import java.util.Random;
public class MathRandomTaskp3t1 {
    public static void main(String[] args) {
        int size = 10;

        //метод Math.random()
        double[] array1 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
        }

        System.out.println("=== Подход 1: Math.random() ===");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array1));

        Arrays.sort(array1);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array1));

        //класс Random
        double[] array2 = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
        }

        System.out.println("\n=== Подход 2: класс Random ===");
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array2));
    }
}
