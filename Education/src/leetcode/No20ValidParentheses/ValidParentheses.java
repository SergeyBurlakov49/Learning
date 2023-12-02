package leetcode.No20ValidParentheses;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.isEmpty()) return false;
        boolean isValid = true;
        if (s.charAt(0) != '(' && s.charAt(0) != '{' && s.charAt(0) != '[') return false;
        char openParenthesis = s.charAt(0);
        char closeParenthesis;
        switch (openParenthesis){
            case '{':
                closeParenthesis = '}';
                break;
            case '[':
                closeParenthesis = ']';
                break;
            default:
                closeParenthesis = ')';
        }
        int openedParenthesis = 1;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == openParenthesis) openedParenthesis++;
            if (s.charAt(i) == closeParenthesis) openedParenthesis--;
            if (openedParenthesis == 0){
                if (i > 1 && !isValid(s.substring(1,i))) isValid = false;
                if (i < s.length() - 1 && !isValid(s.substring(i + 1))) isValid = false;
                break;
            }
        }
        if (openedParenthesis != 0) return false;
        return isValid;
    }
}
