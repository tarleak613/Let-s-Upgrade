/* 138. Copy List with Random Pointer */

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)    return head;
        Node curr = head;
        //1st part to create the new Node and connect it to the main node
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        //2nd part to get the random address
        curr = head;
        while(curr != null){
            //base condition if random has null value
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        //3rd part is to extract the cloned nodes
        Node cloneNodeHead = head.next;
        Node cloneNode = cloneNodeHead;
        curr = head;
        while(curr != null){
            curr.next = curr.next.next;
            if(cloneNode.next != null){
                cloneNode.next = cloneNode.next.next;
            }
            curr = curr.next;
            cloneNode = cloneNode.next;
        }
        return cloneNodeHead;
    }
}