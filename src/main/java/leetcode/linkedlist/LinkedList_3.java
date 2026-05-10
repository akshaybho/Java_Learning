package leetcode.linkedlist;

public class LinkedList_3 {

    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addLast(int data)
    {
        Node newNode = new Node(data);

            if(head == null)
            {
                head = newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;


    }
    public void printList()
    {
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList_3 ls = new LinkedList_3();
        ls.addLast(20);
        ls.addLast(10);
        ls.addLast(5);
        ls.addLast(15);
        ls.addLast(25);
        ls.printList();
    }
}
