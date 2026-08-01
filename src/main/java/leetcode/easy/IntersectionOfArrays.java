package main.java.leetcode.easy;

import javax.swing.*;
import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

       int[] resultarray =  intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {


        Set<Integer> set1 = new HashSet<>();

        for (int n: nums1)
            set1.add(n);

        Set<Integer> set2 = new HashSet<>();
        for (int n: nums2) {

            if (set1.contains(n)) {
                set2.add(n);
            }
        }
            int[] resultArray = new int[set2.size()];

            int i = 0;

            for (int n: set2){
                resultArray[i] = n;
                i++;
            }

            /* we can use iterator on set but I don't want to, rather use simple foreach
            Iterator<Integer> iterator = set2.iterator();

            while (iterator.hasNext()) {
                resultArray[i] = iterator.next();
                i++;
            }*/
           return resultArray;
        }









}
