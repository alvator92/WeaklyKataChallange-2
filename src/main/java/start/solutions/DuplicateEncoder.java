package start.solutions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word){
        Map<Character, Integer> map = new HashMap<>();
        if (word == null) {
            return null;
        }
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch == word.charAt(j)) {
                    count++;
                }
            }
            map.put(ch, count);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int num = map.get(ch);
            if (num > 1) {
                sb.append(")");
            } else {
                sb.append("(");
            }
        }

        return sb.toString();
    }
}
