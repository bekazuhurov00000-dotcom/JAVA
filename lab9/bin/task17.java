class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " говорит: Гав-гав!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " говорит: Мяу!");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " говорит: Чирик!");
    }
}

public class task17 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Cat cat = new Cat("Мурка");
        Bird bird = new Bird("Кеша");

        dog.sound();
        cat.sound();
        bird.sound();
    }
}