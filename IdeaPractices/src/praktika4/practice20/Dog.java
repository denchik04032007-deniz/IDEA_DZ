package praktika4.practice20;

import java.io.Serializable;

class Dog extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String makeSound() {
        return "Гав!";
    }
}
