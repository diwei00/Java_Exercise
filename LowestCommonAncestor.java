import java.util.Stack;
//二叉树最近公共祖先
class Solution56 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) {
                return null;
            }
            Stack<TreeNode> stack1 = new Stack<>();
            Stack<TreeNode> stack2 = new Stack<>();
            //获得路径
            getPass(root, p, stack1);
            getPass(root, q, stack2);
            //求差值，多的路径弹出
            if(stack1.size() > stack2.size()) {
                int differ = stack1.size() - stack2.size();
                while(differ-- != 0) {
                    stack1.pop();
                }
            }else {
                int differ = stack2.size() - stack1.size();
                while(differ-- != 0) {
                    stack2.pop();
                }
            }
            //同时出，相等则为结果
            while(stack1.peek() != stack2.peek()) {
                stack1.pop();
                stack2.pop();
            }
            return stack1.pop();

        }
        //深度优先遍历，直接入，如果左右孩子都不是，
        //则它不为路径上的节点，弹出改节点, 返回false。
        private boolean getPass(TreeNode root, TreeNode tmp, Stack<TreeNode> stack) {

            if(root == null || tmp == null) {
                return false;
            }
            stack.push(root);

            if(root == tmp) {
                return true;
            }

            boolean ret1 = getPass(root.left, tmp, stack);
            if(ret1 == true) {
                return true;
            }
            boolean ret2 = getPass(root.right, tmp, stack);
            if(ret2 == true) {
                return true;
            }
            stack.pop();
            return false;

        }
}
public class LowestCommonAncestor {
    public static void main(String[] args) {

    }
}
