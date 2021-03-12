import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer fromRange = scanner.nextInt();
        Integer toRange = scanner.nextInt() + 1;
        int lineCount = scanner.nextInt();

        SortedMap<Integer, String> sm = new TreeMap<>();
        int i = 0;
        while (i < lineCount) {
            Integer number = scanner.nextInt();
            String str = scanner.next();
            sm.put(number,str);
            i++;
        }

        sm.subMap(fromRange,toRange).forEach((key,value) -> System.out.println(key + " " + value));

    }
}