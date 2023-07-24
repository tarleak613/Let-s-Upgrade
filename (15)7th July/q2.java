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
public class q2 {
    public static Node copyRandomList(Node head) {
        if(head == null)    return head;
        Node curr = head;
        //1st part to create the new Node and connect it to the main node
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next;
        }
        //2nd part to get the random address
        curr = head;
        Node cloneNode;
        while(curr != null){
            cloneNode = curr.next;
            //base condition if random has null value
            if(curr.random != null)
                cloneNode.random = curr.random.next;
            curr = cloneNode.next;
        }
        //3rd part is to extract the cloned nodes
        Node cloneNodeHead = head.next;
        cloneNode = head.next;
        curr = head;
        while(cloneNode.next != null){
            curr.next = cloneNode.next;
            cloneNode.next = cloneNode.next.next;
            curr = curr.next;
            cloneNode = cloneNode.next;
        }
        return cloneNodeHead;
    }
        public static void main(String[] args) {
            // Creating a linked list with random pointer
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.random = head.next.next;
            head.next.random = head;
            head.next.next.random = head.next.next.next.next;
            head.next.next.next.random = head.next.next;
            head.next.next.next.next.random = head.next;
     
            // Print the original list
            System.out.println("The original linked list:");
            printList(head);
     
            // Function call
            Node sol = copyRandomList(head);
     
            System.out.println("The cloned linked list:");
            printList(sol);
        }
          // Function to print the linked list
    public static void printList(Node head) {
        System.out.print(head.val + "(" + head.random.val + ")");
        head = head.next;
        while (head != null) {
            System.out.print(" -> " + head.val + "(" + head.random.val + ")");
            head = head.next;
        }
        System.out.println();
    }
    }
