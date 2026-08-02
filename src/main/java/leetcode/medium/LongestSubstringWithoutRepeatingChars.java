package main.java.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    //we will use sliding window algorithm here
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=d8htv8dm
    public static  int lengthOfLongestSubstring(String s) {

        int maxLenth = 0;
        int left = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            int currentLength = right-left+1;
            maxLenth = Math.max(maxLenth, currentLength);

        }
        return maxLenth;
    }

    public static void main(String[] args) {

        String s =  "abcabcbb";
        int res = lengthOfLongestSubstring(s);
    }
}
