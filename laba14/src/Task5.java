import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int original = n, reversed = 0;
        do {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        } while (n > 0);
        if (original == reversed) System.out.println("Это палиндром");
        else System.out.println("Это не палиндром");
    }
}