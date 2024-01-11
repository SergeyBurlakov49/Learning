package leetcode.No125ValidPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder base = new StringBuilder(s);
        for (int i = 0; i < base.length(); i++) {
            if (!Character.isAlphabetic(base.charAt(i)) &&
                    !Character.isDigit(base.charAt(i))){
                base.deleteCharAt(i);
                i--;
            }
        }
        String a = base.toString().toLowerCase();
        String b = base.reverse().toString().toLowerCase();
        return a.equals(b);
    }

    public static void main(String[] args) {
        new ValidPalindrome().isPalindrome("race a car");
    }
}
