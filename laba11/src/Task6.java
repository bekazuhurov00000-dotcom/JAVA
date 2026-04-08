import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Ошибка: нельзя извлечь корень из отрицательного числа.");
        } else {
            System.out.println("Результат: " + Math.sqrt(num));
        }
    }
}