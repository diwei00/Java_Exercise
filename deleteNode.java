//删除链表节点
//前后指针
class Solution23 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        if(head.val == val) {
            head = head.next;
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur.val != val) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = cur.next;
        return head;


    }
}
public class deleteNode {
}
