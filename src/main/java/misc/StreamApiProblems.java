package main.java.misc;

import main.java.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream api coding questions

public class StreamApiProblems {

    //find the longest string from the given list of strings
    public static String getLongestString(List<String> listOfString){
        return listOfString.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    //Calculate the average age of a list of Person objects using Java streams:
    public static double calculateAverageAge() {

        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        return persons.stream().mapToInt(Person::getAge).average().orElse(0.0);
        //mapToInt(Person::getAge): Maps each Person object to its age as an IntStream.
        //An IntStream in Java is a specialized stream for working with primitive int values, introduced in Java 8 as part of the Stream API
    }


    //Merge two sorted lists into a single sorted list using Java streams:
    public static void mergeTwoSortedLists() {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());
    }

    //Remove duplicates from a list while preserving the order using Java streams:
    public static void removeDuplicates() {

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers = numbersWithDuplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());

    }

        public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        getLongestString(listOfString);

    }
}
