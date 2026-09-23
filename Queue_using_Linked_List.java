// Node class
class Node {
	int data;
	Node next;
	
	Node(int val) {
		data = val;
		next = null;
	}
}

// Queue class
class myQueue {
	Node head;
	Node tail;
	int size = 0;
	
	public myQueue() {
		head = null;
		tail = null;
		
	}
	
	public boolean isEmpty() {
		
		if (head == null)
			return true;
		else
			return false;
	}
	
	public void enqueue(int x) {
		
		Node temp = new Node(x);
		if (tail == null) {
			head = temp;
			tail = temp;
		}
	else {tail.next = temp;
	tail = temp; }
	size++;
}

public void dequeue() {
	
	if (head == null) {
		return;
	}
	
	head = head.next;
	
	if (head == null) {
		tail = null;
	}
	size--;
}

public int getFront() {
	
	// If queue is empty, return -1.
	if (size == 0)
		return - 1;
	else
		return head.data;
	
}

public int size() {
	// Returns the current size of the queue.
	return size;
}
}
