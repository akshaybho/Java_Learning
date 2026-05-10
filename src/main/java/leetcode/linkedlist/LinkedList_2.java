package leetcode.linkedlist;

public class LinkedList_2 {

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
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("The list is empty");
            return;
        }

            Node curreNode = head;
            while(curreNode!=null)
            {
                System.out.print(curreNode.data+" -> ");
                curreNode = curreNode.next;
            }
        }


    public static void main(String[] args) {

        LinkedList_2 ls = new LinkedList_2();
        ls.addFirst(1);
        ls.addFirst(2);
        ls.printList();
    }
}
