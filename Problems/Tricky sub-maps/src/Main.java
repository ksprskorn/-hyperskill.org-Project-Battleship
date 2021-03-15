import java.util.*;

class MapUtils {
    public static Map<Integer, String> getSubMap(TreeMap<Integer, String> map) {
        int fKey = 0;
        int lKey = 0;
        if (map.firstKey() % 2 != 0) {
            fKey = map.firstKey();
            lKey = fKey + 5;
        } else {
            lKey = map.lastKey() + 1;
            fKey = lKey - 5;

        }

        Map<Integer, String> output = new TreeMap<>(Collections.reverseOrder());
        output.putAll(map.subMap(fKey, lKey));

        return output;
    }
}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });

        Map<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}