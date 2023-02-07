//快慢指针
//快指针先走k步,差距为k,然后同时走
class Solution24 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode prev = head;
        ListNode cur = head;
        while(--k != 0) {
            cur = cur.next;
        }
        while(cur.next != null) {
            cur = cur.next;
            prev = prev.next;
        }
        return prev;

    }
}
public class getKthFromEnd {
}
