//非递归后续遍历二叉树
import java.util.*;

class Solution60 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;

            }
            TreeNode tmp = stack.peek();
            //利用prev确定右树遍历完成
            if(tmp.right == null || tmp.right == prev) {
                list.add(tmp.val);
                stack.pop();
                prev = tmp;

            }else {
                cur = tmp.right;
            }
        }
        return list;



    }
}
public class PostorderTraversal2 {
    public static void main(String[] args) {

    }
}
