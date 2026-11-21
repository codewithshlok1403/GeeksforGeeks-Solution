/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    static void dfs(Node root, ArrayList<Node> arr) {
        if (root == null) return;
        arr.add(root);
        dfs(root.left, arr);
        dfs(root.right, arr);
    }

    public static void flatten(Node root) {
        if (root == null || (root.left == null && root.right == null)) return;

        ArrayList<Node> arr = new ArrayList<>();
        dfs(root, arr);

        Node temp = root;
        temp.left = null; 

        for (int i = 1; i < arr.size(); i++) { 
            temp.right = arr.get(i);
            temp.left = null;
            temp = temp.right;
        }

        temp.left = null;
        temp.right = null;
    }
}
