package leetcode.No13RomanToArabic;

public class RomanToArabic {
    public static int romanToInt(String s){
        if (s.isEmpty()) return 0;
        int level = 0;
        int output = 0;
        char [] chars = s.toCharArray();
        for (int counter = chars.length - 1; counter >= 0; counter--){
            switch (chars[counter]){
                case 'I':
                    output = (level == 0) ? output + 1 : output - 1;
                    break;
                case 'V':
                    if (level < 1) level = 1;
                    output += 5;
                    break;
                case 'X':
                    if (level < 1) level = 1;
                    output = (level <= 1) ? output + 10: output - 10;
                    break;
                case 'L':
                    if (level < 2) level = 2;
                    output += 50;
                    break;
                case 'C':
                    if (level < 2) level = 2;
                    output = (level <= 2) ? output + 100: output - 100;
                    break;
                case 'D':
                    if (level < 3) level = 3;
                    output += 500;
                    break;
                case 'M':
                    if (level < 3) level = 3;
                    output += 1000;
                    break;
            }
        }
        return  output;
    }
}
