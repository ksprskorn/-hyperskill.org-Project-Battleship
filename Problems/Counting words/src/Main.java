import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap<String, Integer> sm = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (sm.containsKey(strings[i])) {
                sm.replace(strings[i], sm.get(strings[i]) + 1);
            } else {
                sm.put(strings[i], 1);
            }
        }

        return sm;
    }

    public static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}