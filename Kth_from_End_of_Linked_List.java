/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size || k <= 0) return -1; 

        int n = size - k;
        temp = head;
        for (int i = 1; i <= n; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}

