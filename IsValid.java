import java.util.Stack;
//括号匹配
//利用栈
class Solution43 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(stack.empty()) {
                stack.push(tmp);
            }else {
                char top = stack.peek();
                if(tmp == ')' && top == '('||
                        tmp == ']' && top == '['||
                        tmp == '}' && top == '{') {
                    stack.pop();
                }else {
                    stack.push(tmp);
                }
            }
        }
        if(stack.empty()) {
            return true;
        }
        return false;

    }
}
public class IsValid {
    public static void main(String[] args) {
        String str = "([])";
        Solution43 solution43 = new Solution43();
        boolean ret = solution43.isValid(str);
        System.out.println(ret);

    }
}
