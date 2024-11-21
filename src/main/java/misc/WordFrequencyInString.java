package main.java.misc;

import main.java.leetcode.easy.TwoSum;

import java.util.HashMap;
import java.util.Map;

//We are give a sentence. A word in this string can be repeated. We need to find occurrences or frequency of the word
public class WordFrequencyInString
{
    public static Map<String, Integer> getWordFrequency (String str1){

        String[] words = str1.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for( String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;

    }

    public static void main(String[] args) {

        String str = "in south asia we have five key players in five key areas";

        Map<String, Integer> resultMap = getWordFrequency(str);

        resultMap.forEach((word, frequency) ->
                System.out.println(word + ": " + frequency));
    }
}
