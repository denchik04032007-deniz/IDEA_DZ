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
            System.out.print(d + " ");   //d — простой множитель
            factorize(n / d, d);   //делим и пробуем ТОТ ЖЕ делитель
        }
        else {
            factorize(n, d + 1);   //не делится — пробуем следующий
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorize(n, 2);
    }
}
