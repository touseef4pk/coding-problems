package main.java;

import main.java.leetcode.easy.SortArray;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Merge sort an array
        SortArray sortArray = new SortArray();
        sortArray.mergeSort(new int[]{73, 95, 48, 0, 1}, 5);
    }
}