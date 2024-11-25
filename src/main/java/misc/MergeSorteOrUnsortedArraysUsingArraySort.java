package main.java.misc;

import java.util.Arrays;

public class MergeSorteOrUnsortedArraysUsingArraySort {

    public static int[] mergeAndSort(int[] arr1, int[] arr2) {
        // Step 1: Create a new array with size equal to the sum of both arrays
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Step 2: Copy elements from the first array into the merged array
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }

        // Step 3: Copy elements from the second array into the merged array
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr1.length + i] = arr2[i];
        }

        // Step 4: Sort the merged array
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 2, 9, 1};
        int[] array2 = {8, 3, 7, 4};

        int[] result = mergeAndSort(array1, array2);

        // Print the sorted merged array
        System.out.println("Merged and Sorted Array: " + Arrays.toString(result));
    }
}
