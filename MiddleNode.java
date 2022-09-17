//链表的中间节点
//快慢指针 速度与路程
class Solution33 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }
}
public class MiddleNode {
    public static void main(String[] args) {
        Solution33.ListNode listNode1 = new Solution33.ListNode(1);
        Solution33.ListNode listNode2 = new Solution33.ListNode(2);
        Solution33.ListNode listNode3 = new Solution33.ListNode(2);
        Solution33.ListNode listNode4 = new Solution33.ListNode(3);
        Solution33.ListNode listNode5 = new Solution33.ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution33.ListNode head = listNode1;
        Solution33 solution33 = new Solution33();
        Solution33.ListNode ret = solution33.middleNode(head);
        System.out.println(ret.val);
    }
}
