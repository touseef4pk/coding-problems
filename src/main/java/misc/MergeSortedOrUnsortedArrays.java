package main.java.misc;

import java.util.Arrays;
import java.util.Map;

//This solution for this problem is same as we did using merge sort algorithm for a single unsorted array
//One extra step is first we create a combined array by copy elements from both arrays and then call same merge sorth alogrithm.
public class MergeSortedOrUnsortedArrays {

    public static void mergeSort(int[] inputArray) {
        // Initialize pointers for both arrays
        int inputLength = inputArray.length;

        if(inputLength < 2) {
            return ;
        }

        int mid = inputLength / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputLength-mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = inputArray[i];
        }

        for (int i = mid; i < inputLength; i++) {
            rightArray[i-mid] = inputArray[i];
        }

        //now we have filled both arrays, now keep dividing them until they have one element
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(inputArray, leftArray, rightArray);

    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray){

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i =0;
        int j =0;
        int k = 0;

        while (i < leftSize && j < rightSize){

            if(leftArray[i] <= rightArray[j]){
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftSize){
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize){
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] array1 = {5, 2, 9, 1};
        int[] array2 = {8, 3, 7, 4};

        int[] combinedArray = new int[array1.length + array2.length];

        //first copy elements from first array
        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
        }
        //copy elements from second array
        for (int i = 0; i < array2.length; i++) {
            combinedArray[array1.length + i] = array2[i];
        }

        mergeSort(combinedArray);

        // Print the sorted merged array
        System.out.println("Merged and Sorted Array: ");
    }

}
