public class Task4 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.print(reversed + " ");
        }
    }
}