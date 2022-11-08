import java.util.Stack;
//z最小栈，利用第二个栈存取阶段性最小值
public class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int val) {
        if(s1.empty()) {
            s1.push(val);
            s2.push(val);
        }else {
            s1.push(val);
            if(s2.peek() >= val) {
                s2.push(val);
            }
        }
    }

    public void pop() {
        if(s1.empty()) {
            return;
        }
        int tmp = s1.pop();
        if(tmp == s2.peek()) {
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return s2.peek();
    }
}
