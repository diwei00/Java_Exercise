//环形链表2
//环内相遇处到入口 等于 开始处到入口处
class Solution41 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;
        //找相遇处节点
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                meet = fast;
                break;
            }
        }
        if(meet == null) {
            return null;
        }
        //距离相等，同时走即为环的入口处
        ListNode cur = head;
        while(meet != cur) {
            meet = meet.next;
            cur = cur.next;
        }
        return meet;
    }
}
public class DetectCycle {
    public static void main(String[] args) {
        Solution41.ListNode listNode1 = new Solution41.ListNode(1);
        Solution41.ListNode listNode2 = new Solution41.ListNode(2);
        Solution41.ListNode listNode3 = new Solution41.ListNode(10);
        Solution41.ListNode listNode4 = new Solution41.ListNode(2);
        Solution41.ListNode listNode5 = new Solution41.ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode3;
        Solution41.ListNode head = listNode1;
        Solution41 solution41 = new Solution41();
        Solution41.ListNode ret = solution41.detectCycle(head);
        System.out.println(ret.val);

    }
}
