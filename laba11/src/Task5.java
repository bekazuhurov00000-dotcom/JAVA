import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        System.out.print("Введите степень: ");
        double y = scanner.nextDouble();

        System.out.println("Результат: " + Math.pow(x, y));
    }
}