import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int num;
        System.out.println("Вводите числа (для завершения введите 0):");
        do {
            num = sc.nextInt();
            if (num != 0 && num < min) {
                min = num;
            }
        } while (num != 0);
        
        if (min == Integer.MAX_VALUE) System.out.println("Числа не были введены.");
        else System.out.println("Минимальное число: " + min);
    }
}