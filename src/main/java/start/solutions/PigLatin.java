package start.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class PigLatin {

    public static String pigIt(String str) {
        if (str.length() == 0) {
            return str;
        }

        char[] ints = (str.concat(" ")).toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        boolean isNeed = false;
        char temp = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (isNeed) {
                temp = ints[i];
                isNeed = false;
            } else if (ints[i] == 32) {
                if(!Character.isAlphabetic(temp)) {
                    list.add(temp);
                    break;
                }
                list.add(temp);
                list.add('a');
                list.add('y');
                list.add(' ');
                isNeed = true;
            } else {
                list.add(ints[i]);
            }
        }
        return list.stream().map(Object::toString)
                .collect(Collectors.joining("")).trim();
    }

    // Best practice
    public static String pigIt2(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}
