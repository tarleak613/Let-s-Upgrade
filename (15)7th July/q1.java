/* Linked List creation */

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        }
    }
public class q1{
    static Node head = null;
    public static void addNode(int data){
        Node newNode = new Node(data);
        if(head == null) {   
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        // return newNode;
    }
    public static void displayNode(){
        Node temp = head;
        if(temp == null)    return;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public static void reverseLL(Node start,Node temp,int k){
        //to store the first address
        Node prev = null;
        Node curr= start;
        Node Next = null;
        while(k > 0){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            k--;
        }
        temp = Next;
        head = curr;
        // curr.next = null;
    }
    public static void reverseKtimes(int k){
        Node tempHead = head;
        Node countTemp = head;
        int count = 0;
        Node temp = null;
        while(countTemp != null){
            count++;
            countTemp = countTemp.next;
        }    
            reverseLL(tempHead,temp,k);
            tempHead.next = temp;
            // while()
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        System.out.println("Enter the new node or press -1 to exit: ");
        data = sc.nextInt();
        while(data != -1){
            addNode(data);
            // newNode.addNode(data);
            data = sc.nextInt();
        };
        displayNode();
        reverseKtimes(3);
        // Node temp = null;
        // reverseLL(head,temp,3);
        System.out.println();
        displayNode();
    }
}
