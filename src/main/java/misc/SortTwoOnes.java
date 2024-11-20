package main.java.misc;

import main.java.leetcode.easy.MergeSortedArray;
import main.java.leetcode.easy.RemoveElement;

public class SortTwoOnes {


    //The time complexiy of this solution is O(n) and space complexity O(1) as we are not consuming any extra space.
    public void SortArray(int[] arr)
    {
        int startIndex = 0;
        int lastIndex = arr.length - 1;

        while (startIndex < lastIndex) {
          if(arr[startIndex] == 1 ){
              if(arr[lastIndex] != 1){
                  arr[lastIndex] = arr[lastIndex] + arr[startIndex];
                  arr[startIndex] = arr[startIndex] - arr[lastIndex];
                  arr[lastIndex] = arr[lastIndex] - arr[startIndex];
              } else {
                  lastIndex--;
              }
          } else {
              startIndex++;
          }
        }
    }



    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 1, 0, 1, 0, 1};

        SortTwoOnes sortTwoOnes = new SortTwoOnes();
        sortTwoOnes.SortArray(nums1);
    }

}


