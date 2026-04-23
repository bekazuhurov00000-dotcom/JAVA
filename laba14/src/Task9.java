import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;
        do {
            System.out.println("Введите новый пароль (не менее 6 символов):");
            pass = sc.nextLine();
        } while (pass.length() < 6);
        System.out.println("Пароль успешно установлен.");
    }
}