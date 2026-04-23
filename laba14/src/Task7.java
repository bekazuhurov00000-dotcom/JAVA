import java.util.Random;
public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(11); // Числа от 0 до 10
            System.out.println("Сгенерировано: " + num);
        } while (num != 0);
        System.out.println("Цикл остановлен, выпал 0.");
    }
}