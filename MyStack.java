import java.util.*;

class MyStack2 {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack2() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if(!q1.isEmpty()) {
            q1.offer(x);
        }else {
            q2.offer(x);
        }
    }

    public int pop() {
        if(q1.isEmpty()) {
            int sz = q2.size();
            while(sz - 1 != 0) {
                q1.offer(q2.poll());
                sz--;
            }
            return q2.poll();
        }else {
            int sz = q1.size();
            while(sz - 1 != 0) {
                q2.offer(q1.poll());
                sz--;
            }
            return q1.poll();
        }
    }

    public int top() {
        int tmp = -1;
        if(!q1.isEmpty()) {
            int sz = q1.size();
            for(int i = 0; i < sz; i++) {
                tmp = q1.poll();
                q2.offer(tmp);
            }
            return tmp;
        }else {
            int sz = q2.size();
            for(int i = 0; i < sz; i++) {
                tmp = q2.poll();
                q1.offer(tmp);
            }
            return tmp;
        }
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

}
public class MyStack {
    public static void main(String[] args) {
        MyStack2 stack = new MyStack2();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
    }
}
