import java.util.*;

class Main {
    public static Map<Character, Integer> stringToMap(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (charMap.containsKey(str.charAt(i))) {
                charMap.replace(str.charAt(i), charMap.get(str.charAt(i)) + 1);
            } else {
                charMap.put(str.charAt(i), 1);
            }
        }
        return charMap;
    }

    public static void mapSubtraction(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Map<Character, Integer> charMap1 = map1.size() >= map2.size() ? map1 : map2;
        Map<Character, Integer> charMap2 = map1.size() >= map2.size() ? map2 : map1;

        for (var ch : charMap1.entrySet()) {
            if (charMap2.containsKey(ch.getKey())) {
                Integer removeAmount = charMap1.get(ch.getKey());
                map1.replace(ch.getKey(), Math.abs(map1.get(ch.getKey()) - removeAmount));
                map2.replace(ch.getKey(), Math.abs(map2.get(ch.getKey()) - removeAmount));
            }
        }
    }

    public static Integer countValue(Map<Character, Integer> map) {
        Integer count = 0;

        for (var ch : map.entrySet()) {
            count += map.get(ch.getKey());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt1 = scanner.nextLine().toLowerCase();
        String txt2 = scanner.nextLine().toLowerCase();

        Map<Character, Integer> charMap1 = stringToMap(txt1);
        Map<Character, Integer> charMap2 = stringToMap(txt2);

        mapSubtraction(charMap1, charMap2);

        System.out.println(countValue(charMap1) + countValue(charMap2));

    }
}