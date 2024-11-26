package main.java.leetcode.medium;

public class ReverseInteger {

    public int reverse(int x) {
        int number = x;
        int rev = 0;
        while (number != 0){
            int right = number % 10;
            rev  = rev * 10 + right;
            number = number / 10;
        }
        return rev;
    }
}
