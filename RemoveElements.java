//移除链表元素
//前后指针
class Solution31 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;


    }
}
public class RemoveElements {
    private static void display(Solution31.ListNode head) {
        Solution31.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

    }
    public static void main(String[] args) {
        Solution31.ListNode listNode1 = new Solution31.ListNode(1);
        Solution31.ListNode listNode2 = new Solution31.ListNode(2);
        Solution31.ListNode listNode3 = new Solution31.ListNode(2);
        Solution31.ListNode listNode4 = new Solution31.ListNode(3);
        Solution31.ListNode listNode5 = new Solution31.ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution31.ListNode head = listNode1;
        Solution31 solution31 = new Solution31();
        Solution31.ListNode ret = solution31.removeElements(head,2);
        display(ret);
    }
}
