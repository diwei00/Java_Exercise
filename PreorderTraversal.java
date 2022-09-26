import java.util.*;
//前序遍历
class Solution46 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.add(root.val);
        List<Integer> ret = preorderTraversal(root.left);
        list.addAll(ret);
        List<Integer> ret2 = preorderTraversal(root.right);
        list.addAll(ret2);
        return list;

    }
}
public class PreorderTraversal {
    public static void main(String[] args) {
        Solution46.TreeNode A = new Solution46.TreeNode(1);
        Solution46.TreeNode B = new Solution46.TreeNode(2);
        Solution46.TreeNode C = new Solution46.TreeNode(3);
        Solution46.TreeNode D = new Solution46.TreeNode(4);
        Solution46.TreeNode E = new Solution46.TreeNode(5);
        Solution46.TreeNode F = new Solution46.TreeNode(6);
        Solution46.TreeNode G = new Solution46.TreeNode(7);
        Solution46.TreeNode H = new Solution46.TreeNode(8);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        Solution46 solution46 = new Solution46();
        List<Integer> ret = solution46.preorderTraversal(A);
        System.out.println(ret);

    }
}
