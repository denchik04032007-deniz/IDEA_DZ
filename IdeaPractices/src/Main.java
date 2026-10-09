public class Main {
    public static long Factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: Факториал отрицательного числа не существует!");
            return -1;
        }
        long result = 1;
        for (int h = 1; h <= n; h++) {
            result *= h;
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        int[] mass1 = {12, 24, 34, 45, 21, 23};
        float summa = 0;
        System.out.println("Элементы массива: ");
        for (int i = 0; i < mass1.length; i++) {
            System.out.println(mass1[i]);
            summa += mass1[i];
        }
        System.out.println(summa);
        System.out.println(summa/mass1.length);
        System.out.println("====================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int kol = scanner.nextInt();
        int[] mass2 = new int[kol];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < kol; i++) {
            System.out.println("Элемент: " + i);
            mass2[i] = scanner.nextInt();
        }
        int sumwhile = 0;
        int i = 0;
        while (i < kol) {
            sumwhile += mass2[i];
            i++;
        }
        int sumdowhile = 0;
        int j = 0;
        do {
            sumdowhile += mass2[j];
            j++;
        } while (j < kol);
        int min = mass2[0];
        int max = mass2[0];
        for (int k = 0; k < kol; k++) {
            if (mass2[k] < min) {
                min = mass2[k];
            }
            if (mass2[k] > max) {
                max = mass2[k];
            }
        }
        System.out.println("\n--- Результаты ---");
        System.out.println("Сумма элементов (через while): " + sumwhile);
        System.out.println("Сумма элементов (через do-while): " + sumdowhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("========================================");
        System.out.println("Переданные аргументы командной строки:");
        for (int q = 0; q < args.length; q++) {
            System.out.println("Аргумент [" + q + "]: " + args[q]);
        }
        System.out.println("=======================================");
        System.out.println("Первые 10 чисел гармонического ряда:");
        double elem = 0;
        int p;
        for (p = 1; p <= 10; p++) {
            elem = 1.0 / p;
            System.out.printf("Элемент %d :  1/%-2d  =  %.4f\n", p, p, elem);
        }
        System.out.println("==================================================")
        */
        System.out.println("---Проверка работы метода вычисления факториала---");
        int num0 = 0;
        System.out.println("Факториал " + num0 + "! = " + Factorial(num0));
        int num12 = 12;
        System.out.println("Факториал " + num12 + "! = " + Factorial(num12));
        int numneg = -5;
        Factorial(numneg);
    }
}