//非递归实现二叉树中序遍历
//利用栈
import java.util.*;

class Solution59 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode tmp = stack.pop();
            list.add(tmp.val);
            cur = tmp.right;
        }
        return list;


    }
}
public class InorderTraversal2 {
    public static void main(String[] args) {

    }
}
