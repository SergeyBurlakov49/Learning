package leetcode.No66PlusOne;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] >= 0 && digits[i] <= 8){
                digits[i]++;
                return digits;
            }
            else digits[i] = 0;
        }
        int [] nums = new int[digits.length + 1];
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
