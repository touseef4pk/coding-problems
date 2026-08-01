package main.java.leetcode.medium;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 2) {
            return s;
        }

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindrome
            String strOdd = expandFromCenter(s, i, i);

            // Even-length palindrome
            String strEven = expandFromCenter(s, i, i + 1);

           if(strOdd.length() > longest.length()){
               longest = strOdd;
           }

           if(strEven.length() > longest.length()) {
               longest = strEven;
           }
        }

        return longest;
    }


    private static String expandFromCenter(String s, int left, int right) {

      while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

          left--;
          right++;
      }
      return s.substring(left + 1, right);
    }


    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}