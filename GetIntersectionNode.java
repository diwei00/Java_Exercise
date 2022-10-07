class Solution39 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        //分别求两链表的长度
        int len1 = 0;
        int len2 = 0;
        while(curA != null) {
            len1++;
            curA = curA.next;
        }
        while(curB != null) {
            len2++;
            curB = curB.next;
        }
        //求差值，确定长链表和短链表
        ListNode longList = null;
        ListNode shortList = null;
        int differ = 0;
        if(len1 > len2) {
            longList = headA;
            shortList = headB;
            differ = len1 - len2;
        }else {
            longList = headB;
            shortList = headA;
            differ = len2 - len1;
        }
        while(differ-- != 0) {
            longList = longList.next;
        }
        //同时走，相遇即为相交节点
        while(longList != shortList) {
            if(shortList == null) {
                return null;
            }
            longList = longList.next;
            shortList = shortList.next;
        }
        return longList;
    }
}
public class GetIntersectionNode {
    public static void main(String[] args) {
        Solution39.ListNode listNode1 = new Solution39.ListNode(1);
        Solution39.ListNode listNode2 = new Solution39.ListNode(2);
        Solution39.ListNode listNode3 = new Solution39.ListNode(10);
        Solution39.ListNode listNode4 = new Solution39.ListNode(2);
        Solution39.ListNode listNode5 = new Solution39.ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution39.ListNode head1 = listNode1;


        Solution39.ListNode listNode6 = new Solution39.ListNode(1);
        Solution39.ListNode listNode7 = new Solution39.ListNode(2);
        Solution39.ListNode listNode8 = new Solution39.ListNode(10);
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode3;
        Solution39.ListNode head2 = listNode6;

        Solution39 solution39 = new Solution39();
        Solution39.ListNode ret = solution39.getIntersectionNode(head1, head2);
        System.out.println(ret.val);



    }
}
