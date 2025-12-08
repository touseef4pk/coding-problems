package main.java.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateElement {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,3};
        boolean found = containsDuplicate(nums);
        System.out.println(found);


        int[] nums2 = {1,2,3,4};
        boolean found2 = containsDuplicate(nums2);
        System.out.println(found2);
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
