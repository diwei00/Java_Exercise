import java.util.Deque;
import java.util.LinkedList;

//表示数值的字符串
//列举正确情况，其他都为假
//  ‘.’出现正确情况：只出现一次，且在e的前面
// ‘e’出现正确情况：只出现一次，且出现前有数字
// ‘+’‘-’出现正确情况：只能在开头和e后一位
class Solution59 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) return false;
        //去掉首位空格
        s = s.trim();
        boolean numFlag = false;
        boolean dotFlag = false;
        boolean eFlag = false;
        for (int i = 0; i < s.length(); i++) {
            //判定为数字，则标记numFlag
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numFlag = true;
                //判定为.  需要没出现过.并且没出现过e
            } else if (s.charAt(i) == '.' && !dotFlag && !eFlag) {
                dotFlag = true;
                //判定为e，需要没出现过e，并且出过数字了
            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag) {
                eFlag = true;
                numFlag = false;//为了避免123e这种请求，出现e之后就标志为false
                //判定为+-符号，只能出现在第一位或者紧接e后面
            } else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && (i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {

                //其他情况，都是非法的
            } else {
                return false;
            }
        }
        //应该返回真，由于123e这种情况返回是否存在数字
        return numFlag;
    }
}
public class isNumber {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();




    }
}
