package main.java.leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArrayMergeSortAlgo {

    public static void mergeSort(int[] givenArray) {

        //int[] givenArray2 = {7, 3, 9, 5, 4, 8, 0, 1};
        //givenArray = givenArray2;

        int numberOfElements = givenArray.length;

        if(numberOfElements < 2) {
            return;
        }

        // Find the middle position and create left and right partitions
        int mid = numberOfElements/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[numberOfElements - mid];
        // Fill up the partitions
        for (int i = 0; i < mid; i++) {
            leftArr[i] = givenArray[i];
        }

        for (int i = mid; i < numberOfElements; i++) {
            rightArr[i- mid] = givenArray[i];
        }
        // Apply merge sort on the left parition
        mergeSort(leftArr);

        // Apply merge sort on the right partition
        mergeSort(rightArr);

        // Finally merge the partitions
        merge(givenArray, leftArr, rightArr);

    }


    private static void merge(int[] inputArray, int[] leftArr, int[] rightArr) {

        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        //Now we need 3 indexes or pointers to iterate through left, right and merge array.
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge arrays based on the smaller values. Compare first elements of both left and right arrays.
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                inputArray[k] = leftArr[i];
                i++;
            }
            else {
                inputArray[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // Fill out remaining values if any
        while (i < leftSize) {      //check if i has not iterated through all the left array
            inputArray[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) { // check if j has not iterated through all the right array
            inputArray[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 3, 1};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
