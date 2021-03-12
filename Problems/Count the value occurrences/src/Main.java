import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {

        return Collections.frequency(list1, elem) == Collections.frequency(list2, elem);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int element = Integer.parseInt(scanner.nextLine().trim());

        String[] line1 = scanner.nextLine().split(" ");
        Integer[] numberList1 = new Integer[line1.length];
        for (int i = 0; i < line1.length; i++) {
            numberList1[i] = Integer.parseInt(line1[i]);
        }
        List<Integer> list1 = Arrays.asList(numberList1);

        String[] line2 = scanner.nextLine().split(" ");
        Integer[] numberList2 = new Integer[line2.length];
        for (int i = 0; i < line2.length; i++) {
            numberList2[i] = Integer.parseInt(line2[i]);
        }
        List<Integer> list2 = Arrays.asList(numberList2);

        System.out.println(checkTheSameNumberOfTimes(element, list1, list2));
    }
}
