package leetcode.No26RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        switch (nums.length){
            case 0:
                return 0;
            case 1:
                return 1;
        }
        int k = nums.length;
        for (int i = 1; i < nums.length && i < k; i++) {
            if (nums[i] == nums[i - 1]){
                push(nums,i);
                k--;
                i--;
            }
        }
        return k;
    }

    public static void push(int [] arr, int number){
        for (int i = number; i < arr.length + 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}
