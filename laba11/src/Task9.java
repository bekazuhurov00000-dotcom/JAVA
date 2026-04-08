import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.print("Выберите операцию: ");
        int choice = scanner.nextInt();

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Результат: " + (a + b));
                break;
            case 2:
                System.out.println("Результат: " + (a - b));
                break;
            case 3:
                System.out.println("Результат: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }
}