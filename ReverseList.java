//反转链表
class Solution32 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    //三指针法
    public ListNode reverseList2(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode l1 = null;
        ListNode l2 = head;
        ListNode l3 = head.next;
        while(l2 != null) {
            l2.next = l1;
            l1 = l2;
            l2 = l3;
            if(l3 != null) {
                l3 = l3.next;
            }
        }
        return l1;

    }
    //前插法
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode cur = head.next;
        head.next = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;

    }
}
public class ReverseList {
    private static void display(Solution32.ListNode head) {
        Solution32.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

    }
    public static void main(String[] args) {
        Solution32.ListNode listNode1 = new Solution32.ListNode(1);
        Solution32.ListNode listNode2 = new Solution32.ListNode(2);
        Solution32.ListNode listNode3 = new Solution32.ListNode(2);
        Solution32.ListNode listNode4 = new Solution32.ListNode(3);
        Solution32.ListNode listNode5 = new Solution32.ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution32.ListNode head = listNode1;
        Solution32 solution32 = new Solution32();
        Solution32.ListNode ret = solution32.reverseList2(head);
        display(ret);
    }

}
