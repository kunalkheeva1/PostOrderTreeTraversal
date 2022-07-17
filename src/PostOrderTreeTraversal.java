import java.util.ArrayList;

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


    public static void rec(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;

        rec(root.left, list);
        rec(root.right, list);
        list.add(root.val);
    }
    public static ArrayList<Integer> postOrderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();

        rec(root, list);
        return list;
    }

    public static void main(String[] args) {

    }
}
