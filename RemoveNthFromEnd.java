//删除链表倒数第n个节点
//快慢指针法
class Solution68 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int tmp = n;
        ListNode fast = head;
        while(tmp-- != 0) {
            fast = fast.next;
        }
        ListNode prev = null;
        ListNode slow = head;
        while(fast != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        if(prev == null) {
            head = head.next;
            return head;
        }
        prev.next = slow.next;
        return head;

    }
}
public class RemoveNthFromEnd {
    public static void main(String[] args) {

    }
}
