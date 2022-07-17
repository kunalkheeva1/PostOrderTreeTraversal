import java.util.ArrayList;

// node for the tree traversal
class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(int val, TreeNode right, TreeNode left){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}



public class PostOrderTreeTraversal {

//recursive method for storing the nodes in the list and traversing accordingly
    public static void rec(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        rec(root.left, list);
        rec(root.right, list);
        list.add(root.val);
    }
    // method to return the list of nodes traversed wrt traversal
    public static ArrayList<Integer> postOrderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();

        rec(root, list);
        return list;
    }

    public static void main(String[] args) {

    }
}
