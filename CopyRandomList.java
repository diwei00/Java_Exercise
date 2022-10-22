import java.util.HashMap;
//复制带随机指针的链表（深拷贝）
//利用HashMap存储地址对应结构，利用对应结构连接next和random
class Solution {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node cur = head;
        //利用HashMap存储地址对应结构
        while(cur != null) {
            Node newNode = new Node(cur.val);
            hashMap.put(cur, newNode);
            cur = cur.next;
        }
        cur = head;
        //利用对应结构连接next和random
        while(cur != null) {
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}
public class CopyRandomList {
    public static void main(String[] args) {

    }
}
