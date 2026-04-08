class Animal {
    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Лев рычит");
    }
}

class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Слон трубит");
    }
}

class Monkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("Обезьяна кричит");
    }
}

public class task7 {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}