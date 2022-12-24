import java.util.Scanner;

//合法括号序列判断
public class Test35 {
    public static boolean chkParenthesis(String str, int n) {
        int coun1 = 0;
        int coun2 = 0;
        for(int i = 0; i < n; i++) {
            char tmp = str.charAt(i);
            if(tmp == '(') {
                coun1++;
            }else if(tmp == ')') {
                coun2++;
            }else {
                return false;
            }


        }
        if(coun1 != coun2) {
            return false;
        }else {
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean tmp = chkParenthesis(str, str.length());
    }
}
