interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String breed;

    public Animal(String breed) {
        this.breed = breed;
    }
    @Override
    public String getName() {
        return breed;
    }
}

public class Planet6 {
    public static void main(String[] args) {
        Nameable earth = new Planet("Земля");
        Nameable dog = new Animal("Золотистый ретривер");

        System.out.println("Название планеты: " + earth.getName());
        System.out.println("Порода животного: " + dog.getName());
    }
}