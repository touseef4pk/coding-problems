package main.java.leetcode.easy;

public class SortArrayMergeSortAlgo {

    public void mergeSort(int[] givenArray, int numberOfElements) {

        //int[] givenArray2 = {7, 3, 9, 5, 4, 8, 0, 1};
        //givenArray = givenArray2;

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
        mergeSort(leftArr, mid);

        // Apply merge sort on the right partition
        mergeSort(rightArr, numberOfElements  - mid);

        // Finally merge the partitions
        merge(givenArray, leftArr, rightArr, mid, numberOfElements - mid);

    }


    private void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0, k = 0;

        // Merge arrays based on the smaller values
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }

        // Fill out remaining values if any
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }
}
