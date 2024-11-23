package main.java.misc;

import java.util.Arrays;

public class SumArrayElements {

    public int getSumArrayElements(int[] arr){
       // Arrays.stream(arr).sum(); // short way using stream api
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            sum += arr[i];

        }
        return  sum;
    }
}
