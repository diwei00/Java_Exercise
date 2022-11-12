//删除链表中重复元素2
//首先判断后两个节点值是否一致，如果一致，记录下，从当前位置开始删除
class Solution69 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode cur = tmp;
        while(cur.next != null && cur.next.next != null) {
            if(cur.next.val == cur.next.next.val) {
                int ret = cur.next.val;
                while(cur.next != null && cur.next.val == ret) {
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return tmp.next;


    }
}
public class DeleteDuplicates {
    public static void main(String[] args) {

    }
}
