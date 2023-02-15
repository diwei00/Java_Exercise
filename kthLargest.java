//二叉搜索树的第k大节点
//右子树 --> 根 --> 左子树：搜索树递减序列
//只需要在遍历时计数即可，符合则记录该节点值，递归也不需往后递归了（提前终止）
class Solution34 {
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
    int k;
    int count = 0;
    int tmp;
    public int kthLargest(TreeNode root, int k) {

        this.k = k;
        dfs(root);
        return tmp;
    }
    public void dfs(TreeNode cur) {
        if(cur == null) {
            return;
        }
        dfs(cur.right);
        System.out.println(cur.val);
        count++;
        if(count == k) {
            tmp = cur.val;
            return;
        }


        dfs(cur.left);
    }
}
public class kthLargest {
    public static void main(String[] args) {
        Solution34.TreeNode treeNode1 = new Solution34.TreeNode(3);
        Solution34.TreeNode treeNode2 = new Solution34.TreeNode(1);
        Solution34.TreeNode treeNode3 = new Solution34.TreeNode(4);
        Solution34.TreeNode treeNode4 = new Solution34.TreeNode(2);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        Solution34 solution34 = new Solution34();
        solution34.kthLargest(treeNode1, 1);

    }
}
