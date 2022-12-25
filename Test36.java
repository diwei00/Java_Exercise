import java.util.Scanner;
//把字符串转换为整数
public class Test36 {
    public static int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        char tmp = str.charAt(0);
        int i = 0;
        int len = str.length() - 1;
        if (tmp == '+' || tmp == '-') {
            i++;
            len--;
        }
        int ret = 0;

        for (; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                ret += (str.charAt(i) - '0') * Math.pow(10, len--);
            } else {
                return 0;
            }
        }
        if (tmp == '-') {
            return -ret;
        } else {
            return ret;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StrToInt(scanner.nextLine());
    }
}
