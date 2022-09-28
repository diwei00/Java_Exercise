//二叉树的最大深度
class Solution51 {
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
}
public class MaxDepth {
    public static void main(String[] args) {

    }
}
