/*
GEEKS FOR GEEKS

Doubly linked list Insertion at given position
Difficulty: BasicAccuracy: 47.13%Submissions: 163K+Points: 1Average Time: 20m
Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with value x at the position just after pth node in the doubly linked list and return the head of the updated list.

Examples:

Input: LinkedList: 2<->4<->5, p = 2, x = 6 
Output: 2<->4<->5<->6
Explanation: p = 2, and x = 6. So, 6 is inserted after p, i.e, at position 2 (0-based indexing).
Input: LinkedList: 1<->2<->3<->4, p = 0, x = 44
Output: 1<->44<->2<->3<->4
Explanation: p = 0, and x = 44 . So, 44 is inserted after p, i.e, at position 0 (0-based indexing).
Constraints:
0 <= p < size of doubly linked list <= 106
1 <= x <= 106

*/

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        int count=0;
        Node current=head;
        Node newnode=new Node(x);
        if(head!=null){
            while(count!=p && current.next!=null){
              count=count+1;
              current=current.next;
            }
            newnode.next=current.next;
                  newnode.prev=current;
                  if(current.next!=null){
            current.next.prev=newnode;}
                  
                  current.next=newnode;
        }
        return head;
        
    }
}
