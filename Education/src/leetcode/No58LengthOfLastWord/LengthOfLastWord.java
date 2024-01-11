package leetcode.No58LengthOfLastWord;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        boolean findTheWord = false;
        int length = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))){
                findTheWord = true;
                length++;
            }
            if (findTheWord && s.charAt(i) == ' ') break;
        }
        return length;
    }
}
