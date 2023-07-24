/* 21. Merge Two Sorted Lists */

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;

        //base condition
        if(list1 == null)   return list2;
        if(list2 == null)   return list1;

        // compare the head values(smaller value becomes new head)
        ListNode newHead = null;
        ListNode tail = null;
        // if(h1.val <= h2.val){
        //     newHead = h1;
        //     tail = h1;
        // } 
        // else{
        //     newHead = h2;
        //     tail = h2;
        // }  
        //dummy node concept
        ListNode dummy = new ListNode(-1);
        newHead = dummy;
        tail = dummy;
        //  1->2->3     1->3->4    newHead = 1(h1) = tail
        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                tail.next = h1;
                tail = tail.next;
                h1 = h1.next;
            }
            else{
                tail.next = h2;
                tail = tail.next;
                h2 = h2.next;
            }
        }
        //if there is any element remaining
        if(h1 != null)  tail.next = h1;
        if(h2 != null)  tail.next = h2;
        return newHead.next;
    }
}
