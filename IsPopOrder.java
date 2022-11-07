import java.util.*;
//栈的压入弹出序列
class Solution45 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int tmp = 0;
        for(int i = 0; i < pushA.length; i++) {
            if(pushA[i] != popA[j]) {
                stack.push(pushA[i]);
            }else {
                j++;
                if(!stack.empty()) {
                    tmp = stack.peek();
                }
                while(!stack.empty() && j < popA.length && tmp == popA[j]) {
                    stack.pop();
                    if(!stack.empty()) {
                        tmp = stack.peek();
                    }
                    j++;

                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;

    }
}
public class IsPopOrder {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 3, 2, 1};
        Solution45 solution45 = new Solution45();
        boolean ret = solution45.IsPopOrder(arr1, arr2);
        System.out.println(ret);

    }
}
