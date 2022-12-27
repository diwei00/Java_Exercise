import java.util.HashMap;
import java.util.Stack;
//用两个栈实现队列
class CQueue {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }
    public int deleteHead() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.isEmpty()) {
            return stack2.pop();
        }

        return -1;

    }
}
public class Test38 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

    }

}
