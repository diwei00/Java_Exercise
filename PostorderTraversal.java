import java.util.*;
//后续遍历
class Solution48 {
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
        if(root == null) {
            return list;
        }
        List<Integer> ret = postorderTraversal(root.left);
        list.addAll(ret);
        List<Integer> ret2 = postorderTraversal(root.right);
        list.addAll(ret2);
        list.add(root.val);
        return list;

    }
}
public class PostorderTraversal {
    public static void main(String[] args) {
        Solution48.TreeNode A = new Solution48.TreeNode(1);
        Solution48.TreeNode B = new Solution48.TreeNode(2);
        Solution48.TreeNode C = new Solution48.TreeNode(3);
        Solution48.TreeNode D = new Solution48.TreeNode(4);
        Solution48.TreeNode E = new Solution48.TreeNode(5);
        Solution48.TreeNode F = new Solution48.TreeNode(6);
        Solution48.TreeNode G = new Solution48.TreeNode(7);
        Solution48.TreeNode H = new Solution48.TreeNode(8);
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        Solution48 solution48 = new Solution48();
        List<Integer> ret = solution48.postorderTraversal(A);
        System.out.println(ret);

    }
}
