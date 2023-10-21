package leetcode.No3FindSubstring;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubstring {

    public static int lengthOfLongestSubstring(String s){


    }

    public static byte [][] findPairs(String s){
        char [] stringChars = s.toCharArray();
        byte [][] pairs = new byte[2][s.length()];
        for (byte i = 0; i < s.length(); i++){
            pairs[0][i] = i;
        }
        for (byte i = 0; )
    }


//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0) return 0;
//        String [] strings = generateSubstrings(s);
//        for (String string:strings){
//            if (!hasEqualSymbols(string)) return string.length();
//        }
//        return 1;
//    }
//
//    private static String[] generateSubstrings(String string){
//        ArrayList<String> strings = new ArrayList<>(countSubstrings(string));
//        for (int length = string.length(); length > 0; length--){
//            String [] strings1 = getSubstringsByLength(string, length);
//            strings.addAll(Arrays.asList(strings1));
//        }
//        return strings.toArray(new String[strings.size()]);
//    }
//
//    private static int countSubstrings(String string){
//        int count = 0;
//        for (int i = 1, i1 = string.length(); i <= string.length(); i++, i1--){
//            count += i*i1;
//        }
//        return count;
//    }
//
//    private static String[] getSubstringsByLength(String string, int length){
//        String [] strings = new String[string.length() - length + 1];
//        for (int i = 0; i < strings.length; i++){
//            strings[i] = string.substring(i, i + length);
//        }
//        return strings;
//    }
//
//    private static boolean hasEqualSymbols(String string){
//        boolean hasEqualSymbols = false;
//        char [] chars = string.toCharArray();
//        for (int firstChar = 0; firstChar < string.length() - 1; firstChar++){
//            for (int secondChar = firstChar + 1; secondChar < string.length(); secondChar++){
//                if (string.charAt(firstChar) == string.charAt(secondChar)) hasEqualSymbols = true;
//            }
//        }
//        return hasEqualSymbols;
//    }


}


