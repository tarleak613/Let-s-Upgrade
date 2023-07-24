/* 92. Reverse Linked List II */

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      //base condition
      if(head == null || head.next == null) return head;
      //traverse till the first point(left)
      ListNode curr = head;
      ListNode prev = null;
      while(left >1){
          prev = curr;
          curr = curr.next;
          left--;
          right--;
      }
      ListNode leftIndex = prev;//to store the left index
      ListNode rightIndex = curr;//to store the left index
      ListNode Next = null;
      while(right>0){
          Next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = Next; 
          right--;
      }
      if(leftIndex != null){
          leftIndex.next = prev;
      }
      else{
          head = prev;
      }
      rightIndex.next = curr;
      return head;
    }
}
