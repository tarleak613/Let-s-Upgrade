/* 2095. Delete the Middle Node of a Linked List */

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
    public ListNode middleElement(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while(fast.next != null && fast.next.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next == null){
            prev.next = slow.next;
            return head;
        }
        prev = slow;
        slow = slow.next;
        prev.next = slow.next;
        return head;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null)    return null;
        return middleElement(head);
    }
}
