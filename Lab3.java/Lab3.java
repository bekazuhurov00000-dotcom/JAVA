import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -----------------------------
        // 1. Сумма и среднее арифметическое двух чисел
        // -----------------------------
        System.out.println("Задание 1. Сумма и среднее арифметическое");

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b;
        double average = sum / 2.0;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);


        // -----------------------------
        // 2. Площадь и периметр прямоугольника
        // -----------------------------
        System.out.println("\nЗадание 2. Площадь и периметр прямоугольника");

        System.out.print("Введите длину прямоугольника: ");
        int length = scanner.nextInt();

        System.out.print("Введите ширину прямоугольника: ");
        int width = scanner.nextInt();

        int rectangleArea = length * width;
        int rectanglePerimeter = 2 * (length + width);

        System.out.println("Площадь прямоугольника: " + rectangleArea);
        System.out.println("Периметр прямоугольника: " + rectanglePerimeter);


        // -----------------------------
        // 3. Площадь круга
        // -----------------------------
        System.out.println("\nЗадание 3. Площадь круга");

        final double PI = 3.14;

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double circleArea = PI * radius * radius;

        System.out.println("Площадь круга: " + circleArea);


        // -----------------------------
        // 4. Перевод температуры из Цельсия в Фаренгейт
        // -----------------------------
        System.out.println("\nЗадание 4. Перевод температуры");

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println("Температура в Фаренгейтах: " + fahrenheit);


        // -----------------------------
        // 5. Расстояние при равномерном движении
        // -----------------------------
        System.out.println("\nЗадание 5. Расстояние при равномерном движении");

        System.out.print("Введите скорость (v): ");
        double v = scanner.nextDouble();

        System.out.print("Введите время (t): ");
        double t = scanner.nextDouble();

        double distance = v * t;

        System.out.println("Пройденное расстояние: " + distance);


        // -----------------------------
        // 6. Квадрат и куб числа
        // -----------------------------
        System.out.println("\nЗадание 6. Квадрат и куб числа");

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        int square = x * x;
        int cube = x * x * x;

        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);
    }
}
