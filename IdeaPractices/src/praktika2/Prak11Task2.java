package praktika2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Prak11Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задаем формат даты
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.print("Введите дату и время(например, 10.11.2026 15:30): ");
        String input = scanner.nextLine();

        try {
            Date userDate = sdf.parse(input);

            Date currentDate = new Date();

            System.out.println("Введенная дата: " + sdf.format(userDate));
            System.out.println("Текущая дата:  " + sdf.format(currentDate));

            //Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей.");
            }
            else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей.");
            }
            else {
                System.out.println("Даты совпадают.");
            }
        }
        catch (ParseException e) {
            System.out.println("Ошибка: вы ввели дату в неверном формате!");
        }
    }
}
