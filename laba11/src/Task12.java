import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите процент: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число: ");
        double b = scanner.nextDouble();

        double result = (a / 100) * b;
        System.out.println(a + "% от " + b + " = " + result);
    }
}