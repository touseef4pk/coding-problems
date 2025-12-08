package main.java.leetcode.easy;

public class BinarySearchTarget {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int index = binarySearch(nums, target);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int target) {

        int mid  = nums.length / 2;
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) {

           mid = (min + max) / 2;
          if(nums[mid] == target)
              return mid;
          else if (nums[mid] < target) {
              min = mid + 1;
          }
          else if (nums[mid] > target) {
              max = mid - 1;
          }
        }
     return -1;
    }
}
