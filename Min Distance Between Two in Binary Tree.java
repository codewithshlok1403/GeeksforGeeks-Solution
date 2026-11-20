/* A binary tree node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = null;
		right = null;
	}
}
*/

class Solution {
	boolean exist(Node root, int val) {
		if (root == null)
			return false;
		if (root.data == val) {
			return true;
		}
		return exist(root.left, val) || exist(root.right, val);
		
	}
	Node lca(Node root, int a, int b) {
		if (root == null)
			return null;
		if (root.data == a || root.data == b)
			return root;
		boolean aInLeft = exist(root.left, a);
		boolean bInLeft = exist(root.left, b);
		if (aInLeft && bInLeft)
			return lca(root.left, a, b);
		else if (!aInLeft && !bInLeft)
			return lca(root.right, a, b);
		else
			return root;
	}
	void distance(Node root, int[] dist, int a, int b, int level) {
		if (root == null)
			return;
		if (root.data == a)
			dist[0] = level;
		if (root.data == b)
			dist[1] = level;
		distance(root.left, dist, a, b, level + 1);
		distance(root.right, dist, a, b, level + 1);
	}
	public int findDist(Node root, int a, int b) {
		Node lca = lca(root, a, b);
		int[] dist = {0, 0};
		distance(lca, dist, a, b, 0);
		return dist[0] + dist[1];
		
	}
	
}
