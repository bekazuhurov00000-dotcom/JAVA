import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Выберите операцию (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Результат: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Результат: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Результат: " + (num1 / num2));
                    } else {
                        System.out.println("Ошибка: деление на ноль.");
                    }
                    break;
                default:
                    System.out.println("Неверная операция.");
            }

            System.out.print("Продолжить? (yes/no): ");
            answer = scanner.next();
        }
    }
}