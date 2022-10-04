//二叉搜索树与双向链表
//根据中序遍历，寻找时机改变指向，用prev记录上一个节点
class Solution57 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        convertChild(pRootOfTree);
        TreeNode head = prev;
        while(head.left != null) {
            head = head.left;
        }
        return head;

    }
    TreeNode prev = null;
    public void convertChild(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return;
        }

        convertChild(pRootOfTree.left);
        pRootOfTree.left = prev;
        if(prev != null) {
            prev.right = pRootOfTree;
        }
        prev = pRootOfTree;

        convertChild(pRootOfTree.right);

    }
}

public class Convert {
    public static void main(String[] args) {

    }
}
