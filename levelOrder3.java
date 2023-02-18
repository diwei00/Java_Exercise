import java.util.*;
//层序遍历
//利用-1乘积的交替性，和Collections操作集合类进行逆置来实现

class Solution12 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int flag = 1;
        while(!queue.isEmpty()) {
            List<Integer> list2 = new ArrayList<>();
            int sz = queue.size();
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
            if((flag *= (-1)) < 0) {
                list.add(list2);
            }else {
                Collections.reverse(list2);
                list.add(list2);
            }

        }
        return list;

    }
}
public class levelOrder3 {
}
