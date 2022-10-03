import java.util.Stack;
//用栈实现队列
//用两个栈到数据
class MyQueue2 {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue2() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(empty()) {
            return -1;
        }
        if(!s2.empty()) {
            return s2.pop();
        }
        int sz = s1.size();
        for(int i = 0; i < sz; i++) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        if(empty()) {
            return -1;
        }
        if(!s2.empty()) {
            return s2.peek();
        }
        int sz = s1.size();
        for(int i = 0; i < sz; i++) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}
public class MyQueue {
    public static void main(String[] args) {
        MyQueue2 queue = new MyQueue2();
        queue.push(1);
        queue.push(1);
        queue.push(1);
    }
}
