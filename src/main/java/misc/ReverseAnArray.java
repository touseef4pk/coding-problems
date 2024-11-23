package main.java.misc;

public class ReverseAnArray {

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements from both ends of the array
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    //How do you remove all occurrences of a given character from the input string
    public void removeOccuranceCharacter(){
        String str1 = "Australia";

        str1 = str1.replace("a", "");

        System.out.println(str1); // ustrli
    }
}

