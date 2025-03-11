/*
GEEKS FOR GEEKS
Given an array of integer arr. Your task is to construct the linked list from arr & return the head of the linked list.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: LinkedList: 1->2->3->4->5

*/
//code:
class Solution {
   
  static Node head;
   static Node tail;
   
   
    static Node constructLL(int arr[]) {
         head = null;
        tail = null;
        Solution list=new Solution();
      for (int value : arr) {
           add(list, value); // Optimized add method
        }

      return list.head;
    }
    static void add(Solution list,int data){
        Node newnode=new Node(data);
        if(list.head==null){
            list.head=newnode;
            list.tail=newnode;
            
        }else{
           tail.next=newnode;
           tail=newnode;
        }   
    }
}

