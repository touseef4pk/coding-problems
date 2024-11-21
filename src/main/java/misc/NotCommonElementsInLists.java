package main.java.misc;

import java.util.*;

public class NotCommonElementsInLists {

    public static Set<Integer> getIntersectionArray(HashSet<Integer> list1, HashSet<Integer> list2){


        Set<Integer>  hashSet = new HashSet<>(list1);
        hashSet.retainAll(list2);

        list1.removeAll(hashSet);
        list2.removeAll(hashSet);

         list1.addAll(list2);

         return list1;
    }

    public static void main(String[] args) {

        HashSet<Integer> list1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> list2 = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6));

        getIntersectionArray(list1, list2);
    }
}
