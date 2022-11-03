//合并两个有序链表
//归并法
class Solution35 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        //记录尾节点
        ListNode tmp = newHead;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tmp.next = list1;
                tmp = list1;
                list1 = list1.next;
            }else {
                tmp.next = list2;
                tmp = list2;
                list2 = list2.next;
            }
        }
        if(list1 == null) {
            tmp.next = list2;
        }else {
            tmp.next = list1;
        }
        return newHead.next;



    }
}
public class MergeTwoLists {
    private static void display(Solution35.ListNode head) {
        Solution35.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Solution35.ListNode listNode1 = new Solution35.ListNode(1);
        Solution35.ListNode listNode2 = new Solution35.ListNode(9);
        Solution35.ListNode listNode3 = new Solution35.ListNode(30);
        Solution35.ListNode listNode4 = new Solution35.ListNode(50);
        Solution35.ListNode listNode5 = new Solution35.ListNode(80);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution35.ListNode head1 = listNode1;

        Solution35.ListNode listNode6 = new Solution35.ListNode(1);
        Solution35.ListNode listNode7 = new Solution35.ListNode(8);
        Solution35.ListNode listNode8 = new Solution35.ListNode(20);
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        Solution35.ListNode head2 = listNode6;

        Solution35 solution35 = new Solution35();
        Solution35.ListNode ret = solution35.mergeTwoLists(head1, head2);
        display(ret);


    }
}
