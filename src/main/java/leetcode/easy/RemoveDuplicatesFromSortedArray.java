package main.java.leetcode.easy;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        //we set it 1 because first element is always uniques
        int uniqueNumbers = 1;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[i-1]) { //Compare nums[i] with the previous element nums[i - 1].
                nums[uniqueNumbers] = nums[i];
                uniqueNumbers++;
            }
        }
        return uniqueNumbers;
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};

        RemoveDuplicatesFromSortedArray removeElement = new RemoveDuplicatesFromSortedArray();
        removeElement.removeDuplicates(nums1);
    }
}
