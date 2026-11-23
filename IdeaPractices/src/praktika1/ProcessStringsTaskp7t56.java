package praktika1;

interface StringWorker {
    //Подсчет символов в строке
    int countCharacters(String s);

    //Строка из символов на нечетных позициях
    String oddPositionChars(String s);

    //Инвертирование строки
    String invert(String s);
}

class ProcessStrings implements StringWorker {

    @Override
    public int countCharacters(String s) {
        if (s == null) return 0;
        return s.length();
    }

    @Override
    public String oddPositionChars(String s) {
        if (s == null) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String invert(String s) {
        if (s == null) return "";
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }
}
public class ProcessStringsTaskp7t56 {
    public static void main(String[] args) {
        StringWorker worker = new ProcessStrings();
        String test = "Java Programming";

        System.out.println("Исходная строка: \"" + test + "\"");
        System.out.println("Количество символов: " + worker.countCharacters(test));
        System.out.println("Символы на нечетных позициях: \"" + worker.oddPositionChars(test) + "\"");
        System.out.println("Инвертированная строка: \"" + worker.invert(test) + "\"");
    }
}
