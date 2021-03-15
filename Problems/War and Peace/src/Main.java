import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static Map<String, Integer> wordCounter(String[] inputText) {
        Map<String, Integer> wordCounter = new HashMap<>();

        for (String word : inputText) {
            int count = wordCounter.getOrDefault(word,0);
            wordCounter.put(word,++count);
        }
        return wordCounter;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputText = scanner.nextLine().toLowerCase().split(" ");
        printMap(wordCounter(inputText));
    }
}