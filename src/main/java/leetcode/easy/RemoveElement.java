package main.java.leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {

    //The time complexiy of this solution is O(n) and space complexity O(1) as we are not consuming any extra space.
    public int removeElement(int[] nums, int val) {
        int k = 0;  // slow pointer
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[k] = nums[i];  // copy the element to the front
                k++;                // move slow pointer
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val = 3;

        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(nums1, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
