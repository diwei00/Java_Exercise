//链表分割
class Solution37 {
    static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
        ListNode begin1 = null;
        ListNode end1 = null;
        ListNode begin2 = null;
        ListNode end2 = null;
        ListNode cur = pHead;
        while(cur != null) {
            if(cur.val < x) {
                if(begin1 == null) {
                    begin1 = cur;
                    end1 = cur;
                }else {
                    end1.next = cur;
                    end1 = cur;
                }
            }else {
                if(begin2 == null) {
                    begin2 = cur;
                    end2 = cur;
                }else {
                    end2.next = cur;
                    end2 = cur;
                }
            }
            cur = cur.next;
        }

        //第一段为空
        if(begin1 == null) {
            return begin2;
        }

        end1.next = begin2;
        //第二段不为空，手动置空
        if(begin2 != null) {
            end2.next = null;
        }
        return begin1;
    }
}
public class Partition {
    public static void display(Solution37.ListNode head) {
        Solution37.ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        Solution37.ListNode listNode1 = new Solution37.ListNode(1);
        Solution37.ListNode listNode2 = new Solution37.ListNode(7);
        Solution37.ListNode listNode3 = new Solution37.ListNode(10);
        Solution37.ListNode listNode4 = new Solution37.ListNode(5);
        Solution37.ListNode listNode5 = new Solution37.ListNode(12);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution37.ListNode head = listNode1;
        Solution37 solution37 = new Solution37();
        Solution37.ListNode ret = solution37.partition(head, 8);
        display(ret);
    }
}
