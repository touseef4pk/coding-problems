package main.java.leetcode.medium;

import main.java.util.ListNode;


public class AddTwoNumbers {


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode currentPointer = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null) {

        int sum = 0 + carry;

        if(l1 != null){

          sum += l1.val;
          l1 = l1.next;

        }

        if(l2 != null){

          sum += l2.val;
          l2 = l2.next;

        }

        carry = sum / 10;
        sum = sum % 10;

        currentPointer.next = new ListNode(sum);
        currentPointer = currentPointer.next;

    }
    if(carry > 0){
      currentPointer.next = new ListNode(carry);
    }
    return dummyHead.next;
  }


  ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

    ListNode result = new ListNode(0);
    ListNode ptr = result;

    int carry = 0;    // Set default carry

    while (l1 != null || l2 != null) {

      int sum = 0 + carry;    // Initialize sum

      if (l1 != null) {    // Use number from first list
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {    // Use number from 2nd list
        sum += l2.val;
        l2 = l2.next;
      }

      carry = sum / 10;    // Get sum and carry
      sum = sum % 10;
      ptr.next = new ListNode(sum);
      ptr = ptr.next;
    }

    if (carry == 1) ptr.next = new ListNode(1);

    return result.next;
  }

}
