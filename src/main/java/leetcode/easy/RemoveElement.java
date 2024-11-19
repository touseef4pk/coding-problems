package main.java.leetcode.easy;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {

    //The time complexiy of this solution is O(n) and space complexity O(1) as we are not consuming any extra space.
    public int removeElement(int[] nums, int val) {
        int validSize = 0; int i = 0;
        int length = nums.length;

        //We can do same solution using for loop.
        while (i < length){

            if(nums[i] != val){
               nums[validSize] =  nums[i];
                validSize++;
            }
            i++;
        }
        return validSize;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,2,2,3};
        int val = 3;

        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(nums1, 3);
    }
}
