import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;
        do {
            System.out.print("Введите число (0 для выхода): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Общая сумма: " + sum);
    }
}