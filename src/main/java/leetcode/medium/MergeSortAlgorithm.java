package main.java.leetcode.medium;

import main.java.leetcode.easy.TwoSum;

import java.io.Console;
import java.util.Arrays;

public class MergeSortAlgorithm {


    public static void  mergeSort(int[] inputArray){

        if(inputArray.length < 2)
            return;

        int midIndex = inputArray.length / 2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArray.length - midIndex];

        //fill the left array
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        //fill the right array
        for (int i = midIndex; i < inputArray.length ; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }



        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);

    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray){
        int i = 0, j = 0, k = 0;

        while( i < leftArray.length && j < rightArray.length){

            if(leftArray[i] < rightArray[j]){
                inputArray[k++] = leftArray[i++];
            } else {
                inputArray[k++] = rightArray[j++];
            }
        }

        while(i < leftArray.length){
            inputArray[k++] = leftArray[i++];
        }

        while(j < rightArray.length){
            inputArray[k++] = rightArray[j++];
        }
    }


    public static void main(String[] args) {

        int[] inputArray = new int[]{16, 2, 3, 9, 7, 11, 15};

        System.out.println(Arrays.toString(inputArray));
        mergeSort(inputArray);
        System.out.println(Arrays.toString(inputArray));


    }
}
