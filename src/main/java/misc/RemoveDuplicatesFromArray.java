package main.java.misc;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates() {
        int[] arr = {1,3,3,4,6};
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i+1;

    }

}
