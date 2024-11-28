package main.java.leetcode.medium;


//https://leetcode.com/problems/container-with-most-water/
//Solve it using Two Pointers
public class ContainerWithMostWater {

    public int maxArea(int[] height) {

         int left = 0;
         int right = height.length - 1;
         int maxArea = 0;

         while (left < right){

             int h = Math.min(height[left], height[right]);
             int w = right - left;
             int currentArea = h * w;
             maxArea = Math.max(maxArea, currentArea);

             if(height[left] < height[right]){
                 left++;
             } else {
                 right--;
             }
         }
         return  maxArea;

    }
}
