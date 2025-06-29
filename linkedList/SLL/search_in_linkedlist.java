/*
GEEKS FOR GEEKS
Search in Linked List
Difficulty: EasyAccuracy: 65.4%Submissions: 106K+Points: 2Average Time: 10m
Given a linked list of n nodes and a key, the task is to check if the key is present in the linked list or not.

Example:

Input: n = 4, key = 3
1->2->3->4
Output: true
Explanation: 3 is present in Linked List, so the function returns true.
Constraint:
1 <= n <= 10^5
1 <= key <= 10^5

*/


// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current=head;
        if(head== null){
            return false;
        }
        while(current!=null){
            if(current.data== key){
                return true;
            }
            current=current.next;
        }
        return false;
        
    }
}
