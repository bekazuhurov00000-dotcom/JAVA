public class Task12 {
    public static void main(String[] args) {
        String sentence = "Java is very powerful language";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Самое длинное слово: " + longest);
    }
}