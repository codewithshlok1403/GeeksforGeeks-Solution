/*
Definition for Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = null;
		this.right = null;
	}
}
*/

class Solution {
	public void rightView(Node root, int level, ArrayList<Integer> ans) {
		if (root == null)
			return;
		if (level >= ans.size())
			ans.add(root.data);
		else {
			ans.set(level, root.data);
		}
		rightView(root.left, level + 1, ans);
		rightView(root.right, level + 1, ans);
	}
	public ArrayList<Integer> rightView(Node root) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		rightView(root, 0, ans);
		return ans;
	}
}
