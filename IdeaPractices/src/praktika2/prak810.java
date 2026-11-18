package praktika2;
import java.util.Scanner;

public class prak810 {
    public static int reverse(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int acc) {
        //все цифры числа n обработаны
        if (n == 0) {
            return acc;
        }
        return reverseHelper(n / 10, acc * 10 + n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
