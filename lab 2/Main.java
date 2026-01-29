public class Main {

    int classField = 100;

    public static void main(String[] args) {

        System.out.println("===== Задача 1. Переменные и константы =====");

        int number = 10;
        double price = 99.99;
        boolean isActive = true;
        final double PI = 3.14;

        System.out.println("Число: " + number);
        System.out.println("Цена: " + price);
        System.out.println("Активен: " + isActive);
        System.out.println("Константа PI: " + PI);


        System.out.println("\n===== Задача 2. Примитивные и ссылочные типы =====");

        int primitiveValue = 25;
        String referenceValue = "Java";

        System.out.println("Примитивный тип int: " + primitiveValue);
        System.out.println("Ссылочный тип String: " + referenceValue);


        System.out.println("\n===== Задача 3. Область видимости =====");


        Main example = new Main();
        example.showScope();


        System.out.println("\n===== Задача 4 и 5. Наследование и полиморфизм =====");


        Person person = new Student();

        person.name = "Bekhruz";
        person.age = 19;

        ((Student) person).group = "ИС-24-21";

        person.displayInfo();
    }


    void showScope() {
        int localVariable = 50;

        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
    }
}


class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}


class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
        System.out.println("Группа: " + group);
    }
}
