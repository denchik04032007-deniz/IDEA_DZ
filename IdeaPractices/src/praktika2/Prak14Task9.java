package praktika2;

public class Prak14Task9 {
    public static void main(String[] args) {
        String text = "Мама мыла раму. Рама была белая. Мама была рада.";

        text = text.toLowerCase();

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        int[] count = new int[alphabet.length()];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int index = alphabet.indexOf(ch);
            if (index != -1) {
                count[index]++;
            }
        }
        System.out.println("Буква — Количество");
        for (int i = 0; i < alphabet.length(); i++) {
            if (count[i] > 0) {
                System.out.println(alphabet.charAt(i) + "   |    " + count[i]);
            }
        }
    }
}