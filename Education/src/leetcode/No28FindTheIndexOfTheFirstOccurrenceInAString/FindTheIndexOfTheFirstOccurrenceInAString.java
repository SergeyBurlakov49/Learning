package leetcode.No28FindTheIndexOfTheFirstOccurrenceInAString;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        char [] haystackChar = haystack.toCharArray();
        char [] needleChar = needle.toCharArray();
        for (int i = 0, j = 0; i < haystackChar.length; i++) {
            if (haystackChar[i] == needleChar[j]){
                j++;
                if (j == needleChar.length) return i - j + 1;
            }
            else{
                i -= j;
                j = 0;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        strStr("mississippi", "issip");
    }

}
