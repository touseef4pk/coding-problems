package main.java.leetcode.easy;

//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {

    public void mergeSort(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

            // Copy remaining elements from nums2 (if any)
            while (p2 >= 0) { // This should be a while loop
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.mergeSort(nums1, 3, nums2, 3);
    }


}
