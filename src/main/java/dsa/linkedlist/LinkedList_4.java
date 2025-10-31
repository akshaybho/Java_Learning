package dsa.linkedlist;

public class LinkedList_4 {

    static class Node {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // create nodes
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        //link them together
        head.next = second;
        second.next = third;

        //traverse and print the list
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
    }
}
