import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        int lineCount = 0;
        Scanner scanner = new Scanner(System.in);
        Set<String> input = new TreeSet<>();

        lineCount = scanner.nextInt();

        for (int i = 0; i <= lineCount; i++) {
            input.add(scanner.nextLine());
        }

        for (String output : input) {
            System.out.println(output);
        }
    }
}