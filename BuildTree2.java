//从中序与后序遍历序列构建二叉树
class Solution62 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    private int index = 0;
    public int findIndex(int j, int[] inorder, int begin, int end) {
        for(int i = begin; i <= end; i++) {
            if(inorder[i] == j) {
                return i;
            }
        }
        return -1;
    }
    public TreeNode createTree(int[] inorder, int[] postorder, int begin, int end) {
        if(begin > end) {
            return null;
        }
        int i = findIndex(postorder[index--], inorder, begin, end);
        if(i == -1) {
            return null;
        }
        TreeNode root = new TreeNode(inorder[i]);
        root.right = createTree(inorder, postorder, i + 1, end);
        root.left = createTree(inorder, postorder, begin, i - 1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length - 1;
        TreeNode root = createTree(inorder, postorder, 0, inorder.length - 1);
        return root;
    }
}
public class BuildTree2 {
    public static void main(String[] args) {

    }
}
