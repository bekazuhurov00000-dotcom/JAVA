public class Task9 {
    public static void main(String[] args) {
        String text = "apple,banana,orange";
        String[] parts = text.split(",");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}