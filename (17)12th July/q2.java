/* 1381. Design a Stack With Increment Operation */

class CustomStack {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            next = null;
        }
    }
    Node head;
    int maxSize = 0;
    int count = 0;
    public CustomStack(int maxSize) {
        head = null;
        this.maxSize = maxSize; //Let's assume size = 3
    }
    
    public void push(int x) {
        if(count >= maxSize)    return;
        if(head == null){
            head = new Node(x); //[[1]]
        }
        else{
            Node newNode = new Node(x); // 1 -> 2 -> 3
            newNode.next = head;
            head = newNode;
        }
        count++;
        System.out.print(count+" ");
    }
    
    public int pop() {
        if(head != null){
            int res = head.val;
            head = head.next;
            count--;
            System.out.print(count+" ");
            return res;
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int len = count;
        // System.out.print(count+" ");
        Node temp = head;
        while(temp != null){
            if(len > k){
                temp = temp.next;
                len--;
                continue;
            }
            temp.val += val;
            temp = temp.next;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
