package praktika2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Prak11Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        //В Java месяцы в Calendar начинаются с 0
        Calendar calendar = new GregorianCalendar(year, month - 1, day, hours, minutes);

        Date date = calendar.getTime();

        System.out.println("\n-- Результаты --");
        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
