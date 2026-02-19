package lab5;

import java.util.Scanner;

public class Lab5Cycles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===============================
        // Задание 1. Вывод чисел от 1 до N (for)
        // ===============================
        System.out.println("Задание 1. Вывод чисел от 1 до N");
        System.out.print("Введите число N: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // ===============================
        // Задание 2. Сумма чисел от 1 до N (while)
        // ===============================
        System.out.println("Задание 2. Сумма чисел от 1 до N");
        System.out.print("Введите число N: ");
        int n2 = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n2) {
            sum += i;
            i++;
        }

        System.out.println("Сумма = " + sum);
        System.out.println();

        // ===============================
        // Задание 3. Факториал числа (for)
        // ===============================
        System.out.println("Задание 3. Факториал числа");
        System.out.print("Введите число N: ");
        int n3 = scanner.nextInt();

        long factorial = 1;

        for (int j = 1; j <= n3; j++) {
            factorial *= j;
        }

        System.out.println("Факториал = " + factorial);
        System.out.println();

        // ===============================
        // Задание 4. Чётные числа от 1 до 100 (while + continue)
        // ===============================
        System.out.println("Задание 4. Чётные числа от 1 до 100");

        int number = 1;

        while (number <= 100) {
            if (number % 2 != 0) {
                number++;
                continue;
            }
            System.out.print(number + " ");
            number++;
        }
        System.out.println("\n");

        // ===============================
        // Задание 5. Ввод чисел до 0 (do-while)
        // ===============================
        System.out.println("Задание 5. Ввод чисел до 0");

        int input;
        int total = 0;

        do {
            System.out.print("Введите число (0 для завершения): ");
            input = scanner.nextInt();
            total += input;
        } while (input != 0);

        System.out.println("Сумма введённых чисел = " + total);
        System.out.println();

        // ===============================
        // Дополнительное задание. Таблица умножения 1-5
        // ===============================
        System.out.println("Дополнительное задание. Таблица умножения от 1 до 5");

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
