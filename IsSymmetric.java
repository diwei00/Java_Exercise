//对称二叉树
class Solution54 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSymmetric2(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        //判断结构
        if(left == null && right != null
                || left != null && right == null) {
            return false;
        }
        //判断值
        if(left.val != right.val) {
            return false;
        }
        boolean tmp1 = isSymmetric2(left.left, right.right);
        if(tmp1 == false) {
            return false;
        }
        boolean tmp2 = isSymmetric2(left.right, right.left);
        if(tmp2 == false) {
            return false;
        }
        return true;

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetric2(root.left, root.right);


    }
}
public class IsSymmetric {
    public static void main(String[] args) {

    }
}
