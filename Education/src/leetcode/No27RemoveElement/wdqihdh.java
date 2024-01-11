package leetcode.No27RemoveElement;

class Solution {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int k = nums.length;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                k--;
                push(nums,i);
            }
        }
        return k;
    }


    public static void push(int [] arr, int number){
        for (int i = number; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

    }

    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3}, 3);
    }
}
