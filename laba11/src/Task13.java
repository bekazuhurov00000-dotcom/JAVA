import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - sin");
        System.out.println("2 - cos");
        System.out.println("3 - tan");
        System.out.print("Выберите функцию: ");
        int choice = scanner.nextInt();

        System.out.print("Введите угол в градусах: ");
        double angle = scanner.nextDouble();

        double radians = Math.toRadians(angle);

        switch (choice) {
            case 1:
                System.out.println("sin(" + angle + ") = " + Math.sin(radians));
                break;
            case 2:
                System.out.println("cos(" + angle + ") = " + Math.cos(radians));
                break;
            case 3:
                System.out.println("tan(" + angle + ") = " + Math.tan(radians));
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }
}