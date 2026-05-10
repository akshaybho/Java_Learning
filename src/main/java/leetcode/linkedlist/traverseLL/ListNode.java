package leetcode.linkedlist.traverseLL;

public class ListNode {

    int data;
    ListNode next;

    ListNode(){
        data = 0;
        next = null;
    }
    ListNode(int x){
        data = x;
        next = null;
    }
    ListNode(int x, ListNode next){
        data = x;
        this.next = next;
    }
}
