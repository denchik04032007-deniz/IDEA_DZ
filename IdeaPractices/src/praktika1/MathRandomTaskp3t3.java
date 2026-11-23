package praktika1;

public class MathRandomTaskp3t3 {
    public static void main(String[] args) {
        int size = 4;
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 90) + 10;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        }
        else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}