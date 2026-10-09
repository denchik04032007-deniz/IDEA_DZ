import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "Неизвестно";
        this.model = "Неизвестно";
        this.weight = 0.0;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String incomingNumber) {
        System.out.println("Звонит " + name + " с номера: " + incomingNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправляем сообщение на номера: " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Телефон [Номер: " + number + ", Модель: " + model + ", Вес: " + weight + "г]";
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+7-999-111-22-33", "iPhone 15", 187.0);
        Phone phone2 = new Phone("+7-999-444-55-66", "Samsung S24"); // вес останется 0.0
        Phone phone3 = new Phone(); // всё по умолчанию

        System.out.println("=== Характеристики телефонов ===");
        System.out.println("Телефон 1: " + phone1);
        System.out.println("Телефон 2: " + phone2);
        System.out.println("Телефон 3: " + phone3);
        System.out.println();

        System.out.println("=== Проверка базовых методов ===");

        System.out.println("Номер первого: " + phone1.getNumber());
        phone1.receiveCall("Денис");
        System.out.println();

        System.out.println("Номер второго: " + phone2.getNumber());
        phone2.receiveCall("Артём");
        System.out.println();

        System.out.println("Номер третьего: " + phone3.getNumber());
        phone3.receiveCall("Мама");
        System.out.println();

        System.out.println("=== Проверка перегруженного метода ===");
        phone1.receiveCall("Иван", "+7-900-123-45-67");
        System.out.println();

        System.out.println("=== Проверка отправки сообщений (varargs) ===");
        phone1.sendMessage("+7-999-111-22-33", "+7-999-444-55-66");
        phone2.sendMessage("+7-917-000-00-00");
    }
}