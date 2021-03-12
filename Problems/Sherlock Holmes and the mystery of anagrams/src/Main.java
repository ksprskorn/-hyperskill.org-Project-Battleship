import java.util.*;

class Main {
    public static Map<Character, Integer> stringToMap(String inputWord) {
        Map<Character, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < inputWord.length(); i++) {
            Character ch = inputWord.charAt(i);
            if (wordMap.containsKey(ch)) {
                wordMap.replace(ch, wordMap.get(ch) + 1);
            } else {
                wordMap.put(ch, 1);
            }
        }
        return wordMap;
    }

    public static String compareMap(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        return map1.equals(map2) ? "yes" : "no";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine().toLowerCase();
        String secondWord = scanner.nextLine().toLowerCase();

        System.out.println(compareMap(stringToMap(firstWord), stringToMap(secondWord)));
    }
}