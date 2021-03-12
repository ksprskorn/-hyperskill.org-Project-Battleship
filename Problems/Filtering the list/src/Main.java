import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Integer> numberList = new ArrayList<>();
        for (int i = input.length - 1; i >= 0; i--) {
            Integer number = Integer.parseInt(input[i]);
            if (i % 2 != 0) {
                numberList.add(number);
            }
        }

        for (Integer number : numberList) {
            System.out.print(number + " ");
        }

    }
}