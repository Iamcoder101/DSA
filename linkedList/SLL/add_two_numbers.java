/*
LEET CODE 2
2. Add Two Numbers
Solved
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode newnode=new ListNode(0);
      int carry=0;
        ListNode current1=l1;
      ListNode current2=l2;
      ListNode current=newnode;
     while(current1!=null || current2!=null){
         int val1 = (current1 != null) ? current1.val : 0;
            int val2 = (current2 != null) ? current2.val : 0;
        int temp=val1+val2+carry;
        if(temp>9){
            carry=temp/10;
            temp=temp%10;
        }else{
            carry=0;}
        current.next = new ListNode(temp);
        current=current.next;
       if (current1 != null) current1 = current1.next;
            if (current2 != null) current2 = current2.next;
     }  
     if (carry > 0) {
            current.next = new ListNode(carry);
        }
     return newnode.next;
    }
}
