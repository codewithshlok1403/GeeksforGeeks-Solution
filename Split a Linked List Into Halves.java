/* Node of a linked list
class Node {
	int data;
	Node next;
	Node(int d) { data = d; next = null; }
}
*/

class Solution {
	public Pair<Node, Node> splitList(Node head) {
		if (head == null)
			return new Pair<>(null, null);
		if (head.next == head)
			return new Pair<>(head, head);
		// Code here
		Node temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		temp.next = null;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast.next != null) {
			fast = fast.next;
		}
		
		Node head1 = head;
		Node head2 = slow.next;
		
		slow.next = head1;
		fast.next = head2;
		return new Pair<>(head1, head2);
		
	}
}
