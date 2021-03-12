import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] outputList = scanner.nextLine().split(" ");

        List<String> myList = Arrays.asList(outputList);

        System.out.println(myList);

    }
}