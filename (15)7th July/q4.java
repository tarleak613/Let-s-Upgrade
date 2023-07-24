/* 707. Design Linked List */

/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */
class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int v){
            val = v;
        }
    }
   int length;
   Node head; 
   public MyLinkedList() {
       length = 0;
       head = null;
   }
   public int get(int index) {
       if(index < length && index >= 0){
           Node curr = head;
           while(index>0){
               curr = curr.next;
               index--;
           }
           return curr.val;
       }
       else return -1;
   }
   public void addAtHead(int val) {
       Node newNode = new Node(val);
       newNode.next = head;
       head = newNode;
       length++;
   }
   public void addAtTail(int val) {
       Node newNode = new Node(val);
       length++;
       if(head == null){
          head = newNode;
       }
       else{
          Node curr = head;
          while(curr.next!=null){
           curr = curr.next;
           }
          curr.next = newNode;
       }
   }
   public void addAtIndex(int index, int val) {
       if(index > length) return;
       if(index < 0) {
           addAtHead(val);
           length++;
       }
       else{
           Node x = new Node(-1);
           x.next = head;
           Node curr = x;
           while(index > 0)
           {
               curr = curr.next;
               index--;
           }
           Node newNode = new Node(val);
           Node temp = curr.next;
           curr.next = newNode;
           newNode.next = temp;
           head = x.next;
           length++;
       }
   }
   public void deleteAtIndex(int index) {
       if(index < length&&index>=0){
           length--;
           Node x = new Node(0);
           x.next = head;
           Node curr = x;
           while(index > 0){
               curr = curr.next;
               index--;
           }
           curr.next = curr.next.next;
           head = x.next;
       }
       else return;
   }
}
    

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

