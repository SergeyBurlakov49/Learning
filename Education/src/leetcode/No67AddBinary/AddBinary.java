package leetcode.No67AddBinary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AddBinary {
    public static String addBinary(String a, String b) {
        ArrayList<Character> alist = new ArrayList<>();
        for (char ch:a.toCharArray()){
            alist.add(ch);
        }
        ArrayList<Character> blist = new ArrayList<>();
        for (char ch:b.toCharArray()){
            blist.add(ch);
        }
        if (alist.size() != blist.size()){
            if (alist.size() > blist.size()){
                int difference = alist.size() - blist.size();
                for (int i = 0; i < difference; i++) {
                    blist.add(0, '0');
                }
            }
            else {
                int difference =  blist.size() - alist.size();
                for (int i = 0; i < difference; i++) {
                    alist.add(0, '0');
                }
            }
        }
        int surplus = 0;
        ArrayList<Character> result = new ArrayList<>();
        for (int i = alist.size() - 1; i > -1; i--){
            if (parseChar(alist.get(i)) + parseChar(blist.get(i)) + surplus == 0) result.add(0,'0');
            else if (parseChar(alist.get(i)) + parseChar(blist.get(i)) + surplus == 1){
                surplus = 0;
                result.add(0,'1');
            }
            else if (parseChar(alist.get(i)) + parseChar(blist.get(i)) + surplus == 2){
                surplus = 1;
                result.add(0,'0');
            }
            else if (parseChar(alist.get(i)) + parseChar(blist.get(i)) + surplus == 3){
                surplus = 1;
                result.add(0,'1');
            }
        }
        if (surplus == 1) result.add(0,'1');
        Character [] characters = result.toArray(new Character[0]);
        char[] myCharArray = Arrays.stream(characters)
                .map(Object::toString)
                .collect(Collectors.joining())
                .toCharArray();
        return new String(myCharArray);
    }

    public static int parseChar(char ch){
        return switch (ch){
            case '0' -> 0;
            case '1' -> 1;
            default -> -256;
        };
    }

    public static void main(String[] args) {
        addBinary("111","1");
    }
}
