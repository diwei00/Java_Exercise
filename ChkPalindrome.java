//链表的回文结构
class Solution38 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public boolean chkPalindrome(ListNode A) {
        //找中间节点
        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半段链表
        ListNode l1 = null;
        ListNode l2 = slow;
        ListNode l3 = slow.next;
        while(l2 != null) {
            l2.next = l1;
            l1 = l2;
            l2 = l3;
            if(l3 != null) {
                l3 = l3.next;
            }
        }
        //比对数据
        ListNode begin = A;
        ListNode end = l1;
        while(end != null) {
            if(begin.val != end.val) {
                return false;
            }
            end = end.next;
            begin = begin.next;
        }
        return true;
    }
}
public class ChkPalindrome {
    public static void main(String[] args) {
        Solution38.ListNode listNode1 = new Solution38.ListNode(1);
        Solution38.ListNode listNode2 = new Solution38.ListNode(2);
        Solution38.ListNode listNode3 = new Solution38.ListNode(10);
        Solution38.ListNode listNode4 = new Solution38.ListNode(2);
        Solution38.ListNode listNode5 = new Solution38.ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution38.ListNode head = listNode1;
        Solution38 solution38 = new Solution38();
        boolean ret = solution38.chkPalindrome(head);
        System.out.println(ret);
    }
}
