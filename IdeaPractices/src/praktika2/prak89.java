package praktika2;
import java.util.Scanner;

public class prak89 {
    public static int count(int a, int b) {
        //нулей нет — последовательность одна(все единицы)
        if (a == 0) {
            return 1;
        }
        //единиц нет — ноль может быть только один
        if (b == 0) {
            if (a == 1) {
                return 1;
            }
            return 0;
        }
        return count(a, b - 1) + count(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(count(a, b));
    }
}
