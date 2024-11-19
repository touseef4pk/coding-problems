package main.java.leetcode.easy;

import main.java.util.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeSortedLinkedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(0); // Dummy node for the merged list
        ListNode currentPointer = dummyHead; // Pointer for constructing the merged list

        // Merge nodes from both lists while both are non-empty
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                currentPointer.next = list2; // Attach the smaller node
                list2 = list2.next;         // Move pointer in list2
            } else {
                currentPointer.next = list1; // Attach the smaller node
                list1 = list1.next;         // Move pointer in list1
            }
            currentPointer = currentPointer.next; // Move merged list pointer forward
        }

        // Attach remaining nodes if one list is exhausted
        if (list1 != null) {
            currentPointer.next = list1;
        }
        if (list2 != null) {
            currentPointer.next = list2;
        }

        return dummyHead.next; // Return the merged list starting after dummy
    }

    public static void main(String[] args) {
        // Create first sorted list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create second sorted list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeSortedLinkedLists mergeSortedArray = new MergeSortedLinkedLists();
        ListNode mergedList = mergeSortedArray.mergeTwoLists(list1, list2);
    }


}
