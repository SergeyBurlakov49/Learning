package leetcode.No3FindSubstring;

/** Гений, иначе и не скажешь... */

public class FindSubstring {

    public static int lengthOfLongestSubstring(String s){
        if (s.length() <= 1) return s.length();
        char [] chars = s.toCharArray();
        int length = 1;
        for (int left = 0, right = 1; right < chars.length; right++){
            char check = chars[right];
            boolean hasSameSymbols = false;
            int sameSymbolPlace = 0;
            for (int checkI = right - 1; checkI >= left; checkI--){
                if (check == chars[checkI]){
                    hasSameSymbols = true;
                    sameSymbolPlace = checkI;
                    break;
                }
            }
            if (hasSameSymbols){
                left = sameSymbolPlace + 1;
            }
            else {
                length = Math.max((right - left + 1), length);
            }
        }
        return length;
    }
}


