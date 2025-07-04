/*
Leetcode 876
876. Middle of the Linked List
Solved
Easy
Topics
premium lock icon
Companies
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100

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
    public ListNode middleNode(ListNode head) {
        int length=L_length(head);
        ListNode middle=new ListNode();
        ListNode current=head;
        int mid=0;
        if(length%2==0){
         mid=(length/2)-1;
         }else{
            mid=length/2;
         }
         System.out.println(mid);
        while(current!=null){
            middle=current;
            length--;
            if(length==mid){
                break;
            }
            current=current.next;
        }
        return middle;
        
    }
    public static int L_length(ListNode head){
        ListNode current;
        int count=0;
        current=head;
        if(head==null){
            return -1;
        }
        while(current!=null){
            count++;
            current=current.next;

        }
        return count;
    }
}
