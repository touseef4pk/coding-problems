package main.java.leetcode.medium;

import java.lang.reflect.Array;
import java.util.*;

//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs) {

           char[] giveArray =  str.toCharArray();
            Arrays.sort(giveArray);
            String key = new String(giveArray);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);

        }

     return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat",
                "tea",
                "tan",
                "ate",
                "nat",
                "bat"
        };

        List<List<String>> result = groupAnagrams(strs);
    }



    }
