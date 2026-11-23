package praktika1;

import java.util.Scanner;

enum Season {
    WINTER(-5),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Seasonsp4t1 {
    public static void printFavoriteMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static Season findSeasonByName(String name) {
        for (Season s : Season.values()) {
            if (s.name().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());
        printFavoriteMessage(favoriteSeason);

        System.out.println("\nВведите время года (WINTER, SPRING, SUMMER, AUTUMN):");

        Season userSeason = null;

        while (userSeason == null) {
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Вы ничего не ввели. Попробуйте ещё раз:");
                continue;
            }

            userSeason = findSeasonByName(input.trim());

            if (userSeason == null) {
                System.out.println("Неверное время года. Попробуйте ещё раз (WINTER, SPRING, SUMMER, AUTUMN):");
            }
        }

        System.out.println("Вы выбрали: " + userSeason);
        System.out.println("Средняя температура: " + userSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + userSeason.getDescription());
        printFavoriteMessage(userSeason);

        System.out.println("\nВсе времена года:");
        for (Season season : Season.values()) {
            System.out.println(season + "  Температура: " + season.getAverageTemperature() + "°C  " + season.getDescription());
        }
        scanner.close();
    }
}
