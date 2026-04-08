import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.println("Сумма: " + (a + b));
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число.");
        }
    }
}