import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static Map<String, Integer> wordCounter(String[] inputText) {
        Map<String, Integer> wordCounter = new HashMap<>();

        for (String word : inputText) {
            int count = wordCounter.getOrDefault(word, 0);
            wordCounter.put(word, ++count);
        }
        return wordCounter;
    }

    public static boolean checkIfBusted(Map<String, Integer> givenMap, Map<String, Integer> needMap) {
        for (var word : needMap.keySet()) {
            if (!givenMap.containsKey(word) || needMap.get(word) > givenMap.get(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsInNewspaper = scanner.nextLine().split(" ");
        String[] wordsInLetter = scanner.nextLine().split(" ");

        Map<String, Integer> wordsInNewspaperMap = wordCounter(wordsInNewspaper);
        Map<String, Integer> wordsInLetterMap = wordCounter(wordsInLetter);

        System.out.println(checkIfBusted(wordsInNewspaperMap, wordsInLetterMap) ? "You are busted" : "You get money");
    }
}