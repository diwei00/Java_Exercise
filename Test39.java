import java.util.Stack;

//最小栈，利用第二个栈存取阶段性最小值
class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if(stack1.isEmpty()) {
            stack1.push(x);
            stack2.push(x);
        }else {
            stack1.push(x);
            int tmp = stack2.peek();
            if(tmp >= x) {
                stack2.push(x);
            }
        }
    }

    public void pop() {
        int tmp = stack1.pop();
        if(tmp == stack2.peek()) {
            stack2.pop();
        }

    }

    public int top() {
        return stack1.peek();

    }

    public int min() {
        return stack2.peek();
    }
}
public class Test39 {
    public static void main(String[] args) {

    }
}
