import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        String longestWord = "";
        for (String word: list) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        String finalLongestWord = longestWord;
        list.replaceAll(e -> finalLongestWord);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}