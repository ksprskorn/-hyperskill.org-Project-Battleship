import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();
        int wordsCount = scanner.nextInt();
        for (int i = 0; i < wordsCount; i++) {
            words.add(scanner.next().toLowerCase());
        }

        int lineCount = scanner.nextInt();
        Set<String> text = new TreeSet<>();
        for (int j = 0; j <= lineCount; j++) {
            String[] line = scanner.nextLine().toLowerCase().split(" ");
            text.addAll(Arrays.asList(line));
        }
        text.removeAll(words);


        for (String word : text) {
            System.out.println(word);
        }


    }
}