package main.java.leetcode.medium;

import java.util.Arrays;

public class MergeTwoUnSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {5, 1, 7};
        int[] arr2 = {4, 9, 2};

        //first make combined array from both give arrays
        int[] combinedArray  = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);

        System.out.println(Arrays.toString(combinedArray));
        mergeSort(combinedArray);
        System.out.println(Arrays.toString(combinedArray));


    }

    public static void mergeSort(int[] inputArray) {

        if(inputArray.length < 2) return;

        int midIndex = inputArray.length / 2;

        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[inputArray.length - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputArray.length; i++) {
            rightArray[i-midIndex] = inputArray[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);
    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {

        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }

        while( i < leftArray.length ) {
            inputArray[k++] = leftArray[i++];
        }
        while( j < rightArray.length ) {
            inputArray[k++] = rightArray[j++];
        }
    }

}
