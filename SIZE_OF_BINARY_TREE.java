/* Definition for Node
class Node {
	int data;
	Node left;
	Node right;
	Node(int val) {
		data = val;
		left = null;
		right = null;
	}
} */

class Solution {
	static int sumBT(Node root) {
		// code here
		if (root == null)
			return 0;
		int count = root.data + sumBT(root.left) + sumBT(root.right);
		return count;
	}
}
