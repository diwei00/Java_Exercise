//两两交换链表中的节点
//四指针法
//可以new哨兵位节点，就不用对头部特殊处理
class Solution36 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode l1 = head;
        ListNode l2 = head.next;
        ListNode l3 = head.next.next;
        ListNode prev = new ListNode(0);
        ListNode tmp = prev;
        prev.next = head;
        //分为奇数个节点和偶数个节点
        while(l1 != null && l1.next != null) {
            //交换
            l2.next = l1;
            tmp.next = l2;
            l1.next = l3;
            l1 = l2;
            l2 = l1.next;
            //移动
            l1 = l3;
            tmp = tmp.next.next;
            if(l3 != null && l3.next != null) {
                l2 = l3.next;
                l3 = l3.next.next;
            }
        }
        return prev.next;
    }
}
public class SwapPairs {
    private static void display(Solution36.ListNode head) {
        Solution36.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Solution36.ListNode listNode1 = new Solution36.ListNode(1);
        Solution36.ListNode listNode2 = new Solution36.ListNode(2);
        Solution36.ListNode listNode3 = new Solution36.ListNode(2);
        Solution36.ListNode listNode4 = new Solution36.ListNode(3);
        Solution36.ListNode listNode5 = new Solution36.ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution36.ListNode head = listNode1;
        Solution36 solution36 = new Solution36();
        Solution36.ListNode ret = solution36.swapPairs(head);
        display(ret);

    }
}
