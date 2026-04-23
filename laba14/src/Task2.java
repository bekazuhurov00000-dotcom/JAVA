import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = Math.abs(scanner.nextLong());
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
        System.out.println("Количество цифр: " + count);
    }
}