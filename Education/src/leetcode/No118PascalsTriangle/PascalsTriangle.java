package leetcode.No118PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return null;
        List<Integer> [] arr = new ArrayList[numRows];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                arr[0] = new ArrayList<>();
                arr[0].add(1);
            }
            else if (i == 1){
                arr[1] = new ArrayList<>();
                arr[1].add(1);
                arr[1].add(1);
            }
            else {
                arr[i] = new ArrayList<>();
                arr[i].add(1);
                for (int j = 1; j < arr[i - 1].size(); j++) {
                    arr[i].add((arr[i - 1].get(j - 1)) + (arr[i - 1].get(j)));
                }
                arr[i].add(1);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (List<Integer> list1:arr) list.add(list1);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
