package main.java.leetcode.easy;

import main.java.misc.SortTwoOnes;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] TwoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();
        int[] resArray = new int[2];
        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            if(map.containsKey(diff)){
                resArray[0] = map.get(diff); //it will get the index of the difference from the hashmap
                resArray[1] = i;
                return  resArray;
            }
            map.put(nums[i], i); //we are storing number as key and index as value in the hashmap
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        twoSum.TwoSum(nums1, target);
    }
}
