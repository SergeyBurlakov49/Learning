package leetcode.No88MergeSortedArray;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m + n];
        int k = 0;
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if (nums1[k] < nums2[j] && k < m) {
                result[i] = nums1[k];
                k++;
            }
            else if(j < n){
                result[i] = nums2[j];
                j++;
            }
            else {
                result[i] = nums1[k];
                k++;
            }
        }
    }

}
