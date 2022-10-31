package start.solutions;

public class MexicanWave {
    public static String[] wave(String str) {

        if(str.length() == 0) {
            return new String[0];
        }

        char ch;
        int whiteSpace = 0;
        for (int i = 0; i < str.length(); i ++) {
            ch = str.charAt(i);
            if (ch == 32) {
                whiteSpace++;
            }
        }

        String[] result = new String[str.length() - whiteSpace];
        String temp = "";
        int index = 0;

        for(int i = 0; i < result.length; i++) {
            temp = "";
            for(int j = 0; j < str.length(); j++) {
                ch = str.charAt(j);
                if(j == index && ch != 32) {
                    temp += Character.toString(str.charAt(j)).toUpperCase();
                } else if (j == index) {
                    temp += Character.toString(str.charAt(j));
                    index++;
                } else {
                    temp += Character.toString(str.charAt(j));
                }
            }
            result[i] = temp;
            index++;
        }
        return result;
    }
}
