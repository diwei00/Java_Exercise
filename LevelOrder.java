import java.util.*;
//二叉树的层序输出，用队列soze来控制每一层
class Solution55 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int sz = queue.size();
            List<Integer> list2 = new ArrayList<>();
            while(sz-- != 0) {
                TreeNode cur = queue.poll();
                list2.add(cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            list.add(list2);

        }
        return list;

    }
}
public class LevelOrder {
    public static void main(String[] args) {
        Solution55.TreeNode node1 = new Solution55.TreeNode(3);
        Solution55.TreeNode node2 = new Solution55.TreeNode(9);
        Solution55.TreeNode node3 = new Solution55.TreeNode(20);
        Solution55.TreeNode node4 = new Solution55.TreeNode(15);
        Solution55.TreeNode node5 = new Solution55.TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        Solution55 solution55 = new Solution55();
        solution55.levelOrder(node1);


    }
}
