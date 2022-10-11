//根据二叉树创建字符串
//分情况讨论
class Solution63 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public String tree2str(TreeNode root) {
        if(root == null) {
            return null;
        }
        StringBuffer str = new StringBuffer();

        _tree2str(root, str);
        return str.toString();

    }
    private void _tree2str(TreeNode root, StringBuffer str) {
        if(root == null) {
            return;
        }
        str.append(root.val);
        if(root.left != null) {
            str.append("(");
            _tree2str(root.left, str);
            str.append(")");

        }else {
            if(root.right == null) {
                return;
            }else {
                str.append("()");
            }
        }
        if(root.right == null) {
            return;
        }else {
            str.append("(");
            _tree2str(root.right, str);
            str.append(")");
        }

    }
}
public class Tree2str {
    public static void main(String[] args) {

    }
}
