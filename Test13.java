import java.util.Arrays;
import java.util.Stack;
//去重
public class Test13 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,4,5,5};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int top = stack.peek();
            if(arr[i] != top) {
                stack.push(arr[i]);
            }
        }
        System.out.println(Arrays.toString(stack.toArray()));

    }
}

