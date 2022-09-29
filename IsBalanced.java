//平衡二叉树
class Solution52 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int tmp1 = maxDepth(root.left);
        int tmp2 = maxDepth(root.right);
        return tmp1 > tmp2 ? tmp1 + 1: tmp2 + 1;

    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int tmp1 = maxDepth(root.left);
        int tmp2 = maxDepth(root.right);
        if(Math.abs(tmp1 - tmp2) > 1) {
            return false;
        }
        boolean tmp3 = isBalanced(root.left);
        if(tmp3 == false) {
            return false;
        }
        boolean tmp4 = isBalanced(root.right);
        if(tmp4 == false) {
            return false;
        }
        return true;

    }
}
public class IsBalanced {
    public static void main(String[] args) {

    }
}
