/* 234. Palindrome Linked List */

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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        //1-2-3-4       4-3-2-1
        ListNode prev = null;
        ListNode curr = head;
        ListNode Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)   return true;

        //divide the linked-List into two halfs
        //1->2->2->1->null
        // 1->2->null     2->1->3null
        ListNode mid = findMiddleNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        //reverse the right linked-List
        right = reverseLL(right);


        //check reversed right is equal to left?
        while(left != null && right != null){
            if(left.val == right.val){
                left = left.next;
                right = right.next;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
