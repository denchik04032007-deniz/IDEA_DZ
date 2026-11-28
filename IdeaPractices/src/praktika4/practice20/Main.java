package praktika4.practice20;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        GenericTriple<String, Dog, Integer> correctTriple = new GenericTriple<>("Привет", new Dog(), 42);

        System.out.println("--- Вывод имен классов ---");
        correctTriple.printClassNames();
        System.out.println("Значение V (звук): " + correctTriple.getV().makeSound());
    }
}
