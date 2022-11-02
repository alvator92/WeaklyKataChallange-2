package start.solutions;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        Map<Character, Integer> map = countLetters(str1);
        Map<Character, Integer> map2 = countLetters(str2);

        for (Character c : map2.keySet()) {
            Integer n = map.get(c);
            if (n == null || n < map2.get(c)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer n = map.get(c);
            if (n == null) {
                map.put(c, 1);
            } else {
                map.put(c, n + 1);
            }
        }
        return map;
    }
}
