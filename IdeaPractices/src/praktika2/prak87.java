package praktika2;

import java.util.Scanner;

public class prak87 {
    public static void factorize(int n, int d) {
        if (n == 1) {
            return;
        }
        //остаток — простое число, выводим и выходим
        if (d * d > n) {
            System.out.print(n + " ");
            return;
        }
        //шаг рекурсии
        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);
        }
        else {
            factorize(n, d + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorize(n, 2);
    }
}
