/* 148. Sort List */

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
    public ListNode findMiddleNode(ListNode head){
        if(head == null || head.next == null)   return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode h1,ListNode h2){
        ListNode p1 = h1;
        ListNode p2 = h2;
        if(h1 == null)  return h2;
        if(h2 == null)  return h1;
        ListNode dummy = new ListNode(-1);
        ListNode h3 = dummy;
        ListNode tail = dummy;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                tail.next = p1;
                tail = tail.next;
                p1 = p1.next;
            }
            else{
                tail.next = p2;
                tail = tail.next;
                p2 = p2.next;
            }
        }
        if(p1 != null)  tail.next = p1;
        if(p2 != null)  tail.next = p2;
        return h3.next;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)   return head;
        
        ListNode mid = findMiddleNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        
        left = sortList(left);
        right = sortList(right);
        ListNode result = merge(left,right);
        return result;
    }
}
