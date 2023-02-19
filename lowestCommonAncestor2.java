//二叉树的最近祖先
//分情况：同在左，同在右，一左一右，左右都不在
//递归左右子树讨论，寻找与p q一致的节点
class Solution43 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //左右都没有
        if(left == null && right == null) {
            return null;
        }
        //都在右边
        if(left == null && right != null) {
            return right;
        }
        //都在左边
        if(right == null && left != null) {
            return left;
        }
        //左右都有
        //if(left != null && right != null)
        return root;

    }
}
public class lowestCommonAncestor2 {
}
