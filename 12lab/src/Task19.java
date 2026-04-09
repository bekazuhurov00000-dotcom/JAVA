import java.util.HashMap;

public class Task19 {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}