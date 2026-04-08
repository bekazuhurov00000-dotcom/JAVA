import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        String again = "yes";

        while (again.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.print("Выберите операцию (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            double result = 0;
            String record = "";

            switch (op) {
                case '+':
                    result = a + b;
                    record = a + " + " + b + " = " + result;
                    break;
                case '-':
                    result = a - b;
                    record = a + " - " + b + " = " + result;
                    break;
                case '*':
                    result = a * b;
                    record = a + " * " + b + " = " + result;
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                        record = a + " / " + b + " = " + result;
                    } else {
                        record = "Ошибка: деление на ноль";
                    }
                    break;
                default:
                    record = "Неверная операция";
            }

            System.out.println(record);
            history.add(record);

            System.out.print("Продолжить? (yes/no): ");
            again = scanner.next();
        }

        System.out.println("История вычислений:");
        for (String item : history) {
            System.out.println(item);
        }
    }
}