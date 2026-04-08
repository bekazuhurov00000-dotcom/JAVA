import java.util.Scanner;

public class Task3 {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Результат: " + add(a, b));
                break;
            case '-':
                System.out.println("Результат: " + subtract(a, b));
                break;
            case '*':
                System.out.println("Результат: " + multiply(a, b));
                break;
            case '/':
                System.out.println("Результат: " + divide(a, b));
                break;
            default:
                System.out.println("Неверная операция.");
        }
    }
}