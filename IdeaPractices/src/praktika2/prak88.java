package praktika2;

import java.util.Scanner;

public class prak88 {
    public static boolean isPalindrome(String s) {
        //пустая строка или 1 символ — это палиндром
        if (s.length() <= 1) {
            return true;
        }
        //крайние буквы разные — НЕ палиндром
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        //отрезаем крайние буквы, проверяем середину
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
