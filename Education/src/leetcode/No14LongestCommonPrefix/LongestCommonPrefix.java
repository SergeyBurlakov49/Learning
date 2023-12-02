package leetcode.No14LongestCommonPrefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] strs){
        int strlength = 0;
        maincycle:
        for (int i = 0;; i++) {
//            System.out.println(strs[0].length());
            if (strs[0].length() < i + 1) break maincycle;
            char ch = strs[0].charAt(i);
            for (int i1 = 1; i1 < strs.length; i1++){
                if (strs[i1].length() < i + 1) break maincycle;
                if (strs[i1].charAt(i) != ch) break maincycle;
            }
            strlength++;
        }
        return strs[0].substring(0,strlength);
    }
}
