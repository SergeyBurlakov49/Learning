package leetcode.No3FindSubstring;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubstring {

    public static int lengthOfLongestSubstring(String s){
        switch (s.length()){
            case 0: return 0;
            case 1: return 1;
            default:;
        }
        byte [][] pairs = findPairs(s);
        optimisePairs(pairs);
        return getTopDifference(pairs);
    }

    private static byte [][] findPairs(String s){
        char [] chars = s.toCharArray();
        byte [][] pairs = new byte[2][chars.length];
        for (byte b = 0; b < chars.length; b++){
            pairs[0][b] = b;
            char firstChar = chars[b];
            boolean pairIsFound = false;
            for (byte b1 = (byte) (b + 1); b1 < chars.length && !pairIsFound; b1++){
                if (chars[b1] == firstChar){
                    pairs[1][b] = b1;
                    pairIsFound = true;
                }
            }
            if (!pairIsFound) {
                pairs[1][b] = (byte) chars.length;
            }
        }
        return pairs;
    }

    private static void optimisePairs(byte[][] pairs) {
        for (byte b = 0; b < pairs[0].length; b++){
            for (byte b1 = 0; b1 < pairs[0].length; b1++){
                if (b1 <= b){
                    if ((pairs[0][b1] >= pairs[0][b]) && (pairs[1][b] >= pairs[1][b1] && pairs[1][b] != pairs[1].length)){
                        if ((pairs[0][b1] - pairs[0][b]) > (pairs[1][b] - pairs[1][b1])){
                            pairs[1][b] = (byte) (pairs[1][b1] - 1);
                        }
                        else {
                            pairs[0][b] = (byte) (pairs[0][b1] + 1);
                        }
                    }
                }
            }
        }
    }

    private static int getTopDifference(byte [][] pairs){
        int topDifference = 0;
        for (byte b = 0; b < pairs[0].length; b++){
            if (pairs[1][b] - pairs[0][b] > topDifference) topDifference = pairs[1][b] - pairs[0][b];
        }
        return topDifference;
    }

//    private static int findLongestPairThatDoesntContainsAnyOtherPair (byte [][] pairs){
//        int topDifference = 0;
//        for (byte b = 0; b < pairs[0].length; b++){
//            boolean containedPairIsFound = false;
//            for (byte b1 = 0; b1 < pairs[0].length; b1++){
//                if (b1 != b){
//                    if (isContain(pairs[0][b], pairs[1][b], pairs[0][b1], pairs[1][b1])) containedPairIsFound = true;
//                }
//            }
//            if (!containedPairIsFound && (Math.abs(pairs[0][b] - pairs[1][b]) > topDifference))
//                topDifference = Math.abs(pairs[0][b] - pairs[1][b]);
//        }
//        return topDifference;
//    }


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


