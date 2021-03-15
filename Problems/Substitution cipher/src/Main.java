import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static Map<Character, Character> strToMap(String key, String value) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            map.put(key.charAt(i), value.charAt(i));
        }
        return map;
    }

    public static String code(Map<Character, Character> map, String text) {
        String output = "";
        for (int i = 0; i < text.length(); i++) {
            output += map.get(text.charAt(i));
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine();
        String value = scanner.nextLine();
        String text = scanner.nextLine();
        String encodeText = scanner.nextLine();

        Map<Character, Character> decodeMap = strToMap(key, value);
        Map<Character, Character> encodeMap = strToMap(value, key);

        System.out.println(code(decodeMap, text));
        System.out.println(code(encodeMap, encodeText));
    }
}