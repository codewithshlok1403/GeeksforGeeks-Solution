/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for(int i=1;i<=size/2;i++){
            temp=temp.next;
        }
        return temp.data;
    }
}
