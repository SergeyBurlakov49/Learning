package leetcode.No136SingleNumber;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (!hashSet.contains(num)) hashSet.add(num);
            else hashSet.remove(num);
        }
        return (int) hashSet.toArray()[0];
    }
}
