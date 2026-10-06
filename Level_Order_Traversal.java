/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(qu.size()>0){
            Node rem=qu.remove();
            ans.add(rem.data);
            if(rem.left!=null) qu.add(rem.left);
            if(rem.right!=null) qu.add(rem.right);
        }
        return ans;
    }
}
