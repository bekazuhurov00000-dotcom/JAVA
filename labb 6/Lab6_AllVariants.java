import java.util.Scanner;

public class Lab6_AllVariants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №6");
        System.out.println("Выберите вариант (1, 2 или 3): ");
        int variant = scanner.nextInt();

        System.out.print("Введите x: ");
        double x = scanner.nextDouble();

        double y = 0;

        if (variant == 1) {

            // Вариант 1
            // y = x^2, если x < 0
            // y = 2x + 1, если 0 ≤ x < 5
            // y = √x, если x ≥ 5

            if (x < 0) {
                y = Math.pow(x, 2);
            } else if (x < 5) {
                y = 2 * x + 1;
            } else {
                y = Math.sqrt(x);
            }

        } else if (variant == 2) {

            // Вариант 2
            // y = 3x - 5, если x ≤ 1
            // y = x^2 + 2x, если 1 < x ≤ 4
            // y = 1/x, если x > 4

            if (x <= 1) {
                y = 3 * x - 5;
            } else if (x <= 4) {
                y = x * x + 2 * x;
            } else {
                y = 1 / x;
            }

        } else if (variant == 3) {

            // Вариант 3
            // y = sin(x), если x < 0
            // y = x^3, если 0 ≤ x ≤ 2
            // y = x + 10, если x > 2

            if (x < 0) {
                y = Math.sin(x);
            } else if (x <= 2) {
                y = Math.pow(x, 3);
            } else {
                y = x + 10;
            }

        } else {
            System.out.println("Неверный номер варианта!");
            return;
        }

        System.out.println("Результат y = " + y);

        scanner.close();
    }
}