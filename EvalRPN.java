import java.util.Stack;
//逆波兰表达式求值
//遇到数字入，遇到符号先出一个为右边，再出一个为左边，计算结果入
class Solution44 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack= new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") ||
                    tokens[i].equals("-") ||
                    tokens[i].equals("*") ||
                    tokens[i].equals("/")) {
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                int tmp = 0;
                switch(tokens[i]) {
                    case "+":
                        tmp = left + right;
                        break;
                    case "-":
                        tmp = left - right;
                        break;
                    case "*":
                        tmp = left * right;
                        break;
                    case "/":
                        tmp = left / right;
                        break;
                }

                stack.push(String.valueOf(tmp));

            }else {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());

    }
}
public class EvalRPN {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        Solution44 solution44 = new Solution44();
        int ret = solution44.evalRPN(tokens);
        System.out.println(ret);

    }
}
