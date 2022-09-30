//另一棵树的子树
class Solution50 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null && q != null
                || p != null && q == null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) {
            return false;
        }
        boolean tmp = isSameTree(root, subRoot);
        if(tmp == true) {
            return true;
        }
        boolean tmp2 = isSubtree(root.left, subRoot);
        if(tmp2 == true) {
            return true;
        }
        boolean tmp3 = isSubtree(root.right, subRoot);
        if(tmp3 == true) {
            return true;
        }
        return false;


    }
}
public class IsSubtree {
    public static void main(String[] args) {

    }
}
