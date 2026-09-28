/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public void dfs(Node root,ArrayList<Integer> ans) {
        //  code here
        if(root==null) return;
        dfs(root.left, ans);
        dfs(root.right, ans);
         ans.add(root.data);

    }
    public ArrayList<Integer> postOrder(Node root) {
        //  code here
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(root,ans);
        return ans;


    }
}
