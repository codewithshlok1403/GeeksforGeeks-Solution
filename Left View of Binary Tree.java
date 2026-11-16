/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = this.right = null;
	}
} */

class Solution {
	public void leftView(Node root, int level, ArrayList<Integer> ans) {
		if (root == null)
			return;
		if (ans.size() == level)
			ans.add(root.data);
		leftView(root.left, level + 1, ans);
		leftView(root.right, level + 1, ans);
	}
	
	public ArrayList<Integer> leftView(Node root) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		leftView(root, 0, ans);
		return ans;
		
	}
}
