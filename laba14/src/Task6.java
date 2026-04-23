public class Task6 {
    public static void main(String[] args) {
        int n = 8642135;
        int count = 0;
        do {
            int digit = n % 10;
            if (digit % 2 == 0) count++;
            n /= 10;
        } while (n > 0);
        System.out.println("Количество чётных цифр: " + count);
    }
}