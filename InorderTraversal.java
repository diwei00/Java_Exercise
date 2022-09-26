import java.util.*;
//中序遍历
class Solution47 {
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
        if(root == null) {
            return list;
        }
        List<Integer> ret = inorderTraversal(root.left);
        list.addAll(ret);
        list.add(root.val);
        List<Integer> ret2 = inorderTraversal(root.right);
        list.addAll(ret2);
        return list;

    }
}
public class InorderTraversal {
    public static void main(String[] args) {
        Solution47.TreeNode A = new Solution47.TreeNode(1);
        Solution47.TreeNode B = new Solution47.TreeNode(2);
        Solution47.TreeNode C = new Solution47.TreeNode(3);
        Solution47.TreeNode D = new Solution47.TreeNode(4);
        Solution47.TreeNode E = new Solution47.TreeNode(5);
        Solution47.TreeNode F = new Solution47.TreeNode(6);
        Solution47.TreeNode G = new Solution47.TreeNode(7);
        Solution47.TreeNode H = new Solution47.TreeNode(8);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        Solution47 solution47 = new Solution47();
        List<Integer> ret = solution47.inorderTraversal(A);
        System.out.println(ret);
    }
}
