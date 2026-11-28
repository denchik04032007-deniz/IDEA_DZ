package praktika4.practice19.Task1;

import java.util.Scanner;

public class OrderProcessor {
    private static final String[] clients = {
            "Иванов Иван Иванович",
            "Петров Петр Игоревич",
            "Сидоров Сидор Сидорович"
    };

    private static final String[] inns = {
            "1234414311",
            "111122223333",
            "7707083893"
    };

    public static void validateInn(String fullname, String inn) throws InvalidInnException {
        if (inn == null || !inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidInnException("Размер ИНН должен быть равен 10 или 12 цифрам");
        }

        int clientIndex = -1;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].equalsIgnoreCase(fullname)) {
                clientIndex = i;
                break;
            }
        }

        if (clientIndex == -1) {
            throw new InvalidInnException("Клиент с ФИО: " + fullname + " не найден в базе данных");
        }

        if (!inns[clientIndex].equals(inn)) {
            throw new InvalidInnException("ИНН " + inn + " не соответствует клиенту " + fullname);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Введите номер ИНН: ");
        String inn = sc.nextLine().trim();

        try {
            validateInn(fullName, inn);
            System.out.println("Заказ успешно оформлен для клиента: " + fullName);
        }
        catch (InvalidInnException e) {
            System.out.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }
}
