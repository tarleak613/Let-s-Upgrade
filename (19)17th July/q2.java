/* 622. Design Circular Queue */ 

class MyCircularQueue {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    Node tail;
    public MyCircularQueue(int k) {
        head = null;
        tail = null;
    }
    
    public boolean enQueue(int value) {
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(head == null)    return false;
        head = head.next;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return true;
    }
    
    public int Front() {
        if(head == null)    return -1;
        return head.val;
    }
    
    public int Rear() {
        if(head == null)    return -1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public boolean isEmpty() {
        if(head == null)    return true;
        return false;
    }
    
    public boolean isFull() {
        if(head != null)    return true;
        return false;        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */