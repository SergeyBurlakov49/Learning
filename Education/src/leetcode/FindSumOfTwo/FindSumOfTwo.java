package leetcode.FindSumOfTwo;

import java.util.Arrays;

public class FindSumOfTwo {
    public static void main(String[] args) {
        int [] arr = {-1,2,5,8};
        int [] arr2 = {-3, -1, 0, 2, 6};
        int [] arr3 = {2,4,5};
        int [] arr4 = {-2, -1, 1, 2};
        System.out.println(Arrays.toString(findSumOfTwo(arr, 7)));
        System.out.println(Arrays.toString(findSumOfTwo(arr2, 6)));
        System.out.println(Arrays.toString(findSumOfTwo(arr4, 0)));
        System.out.println(Arrays.toString(findSumOfTwo(arr3, 8)));
    }

    public static int [] findSumOfTwo(int [] arr, int s){
        for (int i = 0, j = arr.length - 1;i != j;) {
            if (arr[i] + arr[j] == s){
                return new int[]{arr[i], arr[j]};
            }
            else if (arr[i] + arr[j] < s) {
                i++;
            }
            else j--;
        }
        return null;
    }
}
