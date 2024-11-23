package main.java.misc;

import java.util.Arrays;

public class LargestElementAndSecondLargest {

    public static int getLargestElement(int[] array){

        int largest = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if(largest < array[i]){

                largest = array[i];
            }
        }

        return largest;
    }

    public static int getSecondLargestElement(int[] array){
        //using sorting
/*        Arrays.sort(array);
        int secondLargest = array[array.length-2];*/

        //without sorting
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {

            if(largest < array[i]){
                secondLargest = largest;
                largest =array[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] array = {2,3,4,6,1};

       int res =  getSecondLargestElement(array); //LargestElementAndSecondLargest.getLargestElement(array);

    }

}
