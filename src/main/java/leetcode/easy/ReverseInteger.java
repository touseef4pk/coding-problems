package main.java.leetcode.easy;

import java.util.Arrays;

public class ReverseInteger {

    public static int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            int right = x % 10;

            rev = (rev * 10) + right;

            x = x / 10;

        }
      return  rev;
    }

    public static void main(String[] args) {

        int val = -123;
        int rev = reverse(val);
    }
}
