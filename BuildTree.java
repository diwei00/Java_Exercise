//从前序与中序遍历序列构建二叉树
class Solution61 {
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
    public TreeNode createTree(int[] preorder, int[] inorder, int begin, int end) {
        if(begin > end) {
            return null;
        }
        int i = findIndex(preorder[index++], inorder, begin, end);
        if(i == -1) {
            return null;
        }
        TreeNode root = new TreeNode(inorder[i]);
        root.left = createTree(preorder, inorder, begin, i - 1);
        root.right = createTree(preorder, inorder, i + 1, end);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = createTree(preorder, inorder, 0, inorder.length - 1);
        return root;

    }
}
public class BuildTree {
    public static void main(String[] args) {

    }
}
