package leetcode.No5LongestPalindromicSubstring;

import java.util.*;
import java.util.stream.Stream;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("aboba"));
    }

    public String longestPalindrome(String s) {
        String longestPalindrome = Character.toString(s.charAt(0));
        char [] chars = s.toCharArray();
        if (s.length() > 1 && s.charAt(0) == s.charAt(1)) longestPalindrome = s.substring(0,2);
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && checkPalindrome(chars,i, i + 1).length() > longestPalindrome.length()) longestPalindrome = checkPalindrome(chars,i, i + 1);
            if (checkPalindrome(chars,i).length() > longestPalindrome.length()) longestPalindrome = checkPalindrome(chars,i);
        }
        return longestPalindrome;
    }

    public static String checkPalindrome(char [] chars, int pos){
        if (chars[pos + 1] == chars[pos - 1]) return checkPalindrome(chars, pos + 1, pos - 1);
        else return String.valueOf(chars[pos]);
    }

    public static String checkPalindrome(char [] chars, int pos1, int pos2){
        if (pos1 != 0 && pos2 != chars.length - 1 && chars[pos1 - 1] == chars[pos2 + 1]) return checkPalindrome(chars,pos1 - 1,pos2 + 1);
        else return new String(chars, pos1, pos2 - pos1 + 1);
    }
}

