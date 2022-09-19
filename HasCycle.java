//环形链表
//追击相遇  步长差为1肯定在环内相遇
class Solution40 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //当作不带环遍历，如果带环则会相遇
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
public class HasCycle {
    public static void main(String[] args) {
        Solution40.ListNode listNode1 = new Solution40.ListNode(1);
        Solution40.ListNode listNode2 = new Solution40.ListNode(2);
        Solution40.ListNode listNode3 = new Solution40.ListNode(10);
        Solution40.ListNode listNode4 = new Solution40.ListNode(2);
        Solution40.ListNode listNode5 = new Solution40.ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode3;
        Solution40.ListNode head = listNode1;
        Solution40 solution40 = new Solution40();
        boolean ret = solution40.hasCycle(head);
        System.out.println(ret);



    }
}
