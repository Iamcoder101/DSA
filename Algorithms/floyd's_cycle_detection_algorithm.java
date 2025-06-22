/*
The Floyd's Tortoise and Hare Algorithm (also called the Floyd's Cycle Detection Algorithm) is a pointer-based algorithm primarily used for detecting cycles in a linked list, but it's often adapted to solve other problems, like finding the middle node.

✅ Main Purpose of Floyd’s Tortoise and Hare Algorithm
➡️ Detect if a linked list contains a cycle (loop)
This is its original and main purpose.

🎯 How it works (Cycle Detection):
Two pointers:

slow moves 1 step at a time

fast moves 2 steps at a time

If there’s a cycle, fast will eventually "lap" and meet slow.

If there’s no cycle, fast will reach the end (null) safely.
*/

/*
Other Uses (Adaptations of the Idea)
The middle node trick is an application of the same two-pointer approach — but not for cycle detection. Here's how it's repurposed:

Problem	How it uses the idea
✅ Find middle of linked list   :	  When fast reaches the end, slow is at the middle
✅ Detect start of the cycle    :   After detecting cycle, reset one pointer to head, move both one step each — where they meet is the start of the cycle
✅ Finding Kth element from end : 	Use fast pointer to go k steps ahead, then move both until fast reaches end

*/
//for cycle 
public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            return true; // cycle detected
        }
    }

    return false; // no cycle
}
//for middle

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

