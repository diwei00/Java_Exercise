//翻转二叉树
class Solution53 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        //翻转左右
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //递归左树和右树
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }
}
public class InvertTree {
    public static void main(String[] args) {

    }
}
