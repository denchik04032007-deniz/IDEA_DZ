public class CurrencyConverter {
    private final double usdRate = 95.50;
    private final double eurRate = 102.10;
    private final double cnyRate = 13.20;

    public void convertToRub(double amount, String currency) {
        double result = 0;
        String symbol = "";

        if (currency.equalsIgnoreCase("USD")) {
            result = amount * usdRate;
            symbol = "$";
        } else if (currency.equalsIgnoreCase("EUR")) {
            result = amount * eurRate;
            symbol = "€";
        } else if (currency.equalsIgnoreCase("CNY")) {
            result = amount * cnyRate;
            symbol = "¥";
        } else {
            System.out.println("Ошибка: Неподдерживаемая валюта!");
            return;
        }

        System.out.printf("Результат: %.2f%s = %.2f руб.%n", amount, symbol, result);
    }

    public void convertFromRub(double rubAmount, String targetCurrency) {
        double result = 0;
        String symbol = "";

        if (targetCurrency.equalsIgnoreCase("USD")) {
            result = rubAmount / usdRate;
            symbol = "$";
        } else if (targetCurrency.equalsIgnoreCase("EUR")) {
            result = rubAmount / eurRate;
            symbol = "€";
        } else if (targetCurrency.equalsIgnoreCase("CNY")) {
            result = rubAmount / cnyRate;
            symbol = "¥";
        } else {
            System.out.println("Ошибка: Неподдерживаемая валюта!");
            return;
        }

        System.out.printf("Результат: %.2f руб. = %.2f%s%n", rubAmount, result, symbol);
    }
}
