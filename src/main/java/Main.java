package main.java;

import main.java.leetcode.easy.SortArrayMergeSortAlgo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Merge sort an array
        SortArrayMergeSortAlgo sortArray = new SortArrayMergeSortAlgo();
        sortArray.mergeSort(new int[]{73, 95, 48, 0, 1}, 5);
    }
}