//对链表进行插入排序
//始终维护tail，保证tail的next位null

class Solution70 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode tmp = head;
        ListNode sentry = new ListNode(0);
        sentry.next = head;
        ListNode cur = sentry.next.next;
        ListNode curNext = cur.next;
        ListNode tail = sentry.next;
        tail.next = null;

        while(cur != null) {
            ListNode prev = sentry;
            while(prev.next != null ) {
                if(prev.next.val > cur.val) {
                    cur.next = prev.next;
                    prev.next = cur;
                    break;
                }else {
                    prev = prev.next;
                }
            }
            //尾插，修正tail，认为next为null就是位节点，始终维护tail
            if(prev.next == null) {
                prev.next = cur;
                cur.next = null;
            }
            cur = curNext;
            if(cur != null) {
                curNext = cur.next;
            }
        }
        return sentry.next;
    }
}
public class InsertionSortList {
    public static void main(String[] args) {

    }
}
