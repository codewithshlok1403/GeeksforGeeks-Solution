/* Structure of a Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
	Node divide(Node head) {
	    if(head==null || head.next==null)return head;
		// code here
		Node dummy1 = new Node(-1);
		Node dummy2 = new Node(-1);
		Node t1 = dummy1;
		Node t2 = dummy2;
		Node t = head;
		while (t != null) {
			if (t.data%2 == 0) {
				t1.next = t;
				t1 = t1.next;
				t = t.next;
			} else {
				t2.next = t;
				t2 = t2.next;
				t = t.next;
			}
		}
		t1.next = dummy2.next;
		t2.next = null;
		return dummy1.next;
	}
}
