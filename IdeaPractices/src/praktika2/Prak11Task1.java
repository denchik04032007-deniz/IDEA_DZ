package praktika2;

import java.util.Date;

public class Prak11Task1 {
    public static void main(String[] args) {
        String developerLastName = "Хамидуллин";

        //Дата и время получения задания
        Date receivedDate = new Date();

        //Дата и время сдачи задания
        Date submissionDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + receivedDate);
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
