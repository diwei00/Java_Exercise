//反转链表Ⅱ
//设置哨兵位节点，保证处理区域在中间
class Solution42 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null) {
            return head;
        }

        //哨兵位节点
        ListNode ret = new ListNode(-1);
        ret.next = head;

        //记录区域
        ListNode tmp1 = ret;
        ListNode tmp2 = ret;
        for(int i = 0; i < left - 1; i++) {
            tmp1 = tmp1.next;
        }
        for(int i = 0; i < right; i++) {
            tmp2 = tmp2.next;
        }
        ListNode tmp3 = tmp2;
        tmp2 = tmp2.next;
        tmp3.next = null;

        ListNode end = tmp1.next;
        ListNode begin = tmp3;
        //反转链表
        ListNode l1 = null;
        ListNode l2 = tmp1.next;
        ListNode l3 = tmp1.next.next;
        while(l2 != null) {
            l2.next = l1;
            l1 = l2;
            l2 = l3;
            if(l3 != null) {
                l3 = l3.next;
            }
        }
        //连接
        tmp1.next = begin;
        end.next = tmp2;
        return ret.next;

    }
}
public class ReverseBetween {
    private static void display(Solution42.ListNode head) {
        Solution42.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Solution42.ListNode listNode1 = new Solution42.ListNode(1);
        Solution42.ListNode listNode2 = new Solution42.ListNode(2);
        Solution42.ListNode listNode3 = new Solution42.ListNode(3);
        Solution42.ListNode listNode4 = new Solution42.ListNode(4);
        Solution42.ListNode listNode5 = new Solution42.ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution42.ListNode head = listNode1;
        Solution42 solution42 = new Solution42();
        Solution42.ListNode ret = solution42.reverseBetween(head, 2, 4);
        display(ret);

    }
}
