//树的子结构
//如果根节点一样则去判断是否为子树
//不一样则递归左子树和B，左子树不成功则递归右子树和B，都不成功返回false
//子树判断：如果数据不一样直接返回false，否则递归各自的左右子树
class Solution13 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSame(TreeNode A, TreeNode B) {
        if(B == null) {
            return true;
        }
        if(A == null) {
            return false;
        }
        if(A.val == B.val) {
            return isSame(A.left, B.left) && isSame(A.right, B.right);
        }else {
            return false;
        }
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null || A == null) {
            return false;
        }
        if(A.val == B.val && isSame(A,B)) {
            return true;
        }
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);

    }
}
public class isSubStructure {
}
