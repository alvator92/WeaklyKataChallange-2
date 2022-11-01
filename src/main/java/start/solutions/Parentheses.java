package start.solutions;

public class Parentheses {
    public static boolean validParentheses(String parens) {
        if (parens == null) {
            return false;
        }
        int paranthesis = 0;
        for (int i = 0; i < parens.length(); i++) {
            char ch = parens.charAt(i);
            if (ch == 40) {
                paranthesis++;
            } else if (ch == 41) {
                paranthesis--;
            }
            if (paranthesis < 0) {
                return false;
            }
        }
        if (paranthesis == 0) {
            return true;
        }
        return false;
    }
}
