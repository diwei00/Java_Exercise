//倒数第K个节点
//差速法（速度与路程）
class Solution34 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k-- != 0) {
            if(fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}

public class FindKthToTail {
    public static void main(String[] args) {
        Solution34.ListNode listNode1 = new Solution34.ListNode(1);
        Solution34.ListNode listNode2 = new Solution34.ListNode(2);
        Solution34.ListNode listNode3 = new Solution34.ListNode(2);
        Solution34.ListNode listNode4 = new Solution34.ListNode(3);
        Solution34.ListNode listNode5 = new Solution34.ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution34.ListNode head = listNode1;
        Solution34 solution34 = new Solution34();
        Solution34.ListNode ret = solution34.FindKthToTail(head, 2);
        System.out.println(ret.val);
    }
}
