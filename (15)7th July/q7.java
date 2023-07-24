/* 876. Middle of the Linked List */

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
        if(head == null || head.next == null)    return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast.next != null && fast.next.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null){
            // prev.next = slow.next;
            return slow;
        }
        slow = slow.next;
        return slow;
    }
}