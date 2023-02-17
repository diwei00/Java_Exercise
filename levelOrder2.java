import java.util.*;
//二叉树层序遍历（利用队列中数据个数来控制层数）
class Solution11 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            List<List<Integer>> list = new ArrayList<>();
            return list;
        }
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list2 = new ArrayList<>();
            int sz = queue.size();
            while(sz -- != 0) {
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
public class levelOrder2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

    }
}
