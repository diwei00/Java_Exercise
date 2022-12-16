//字符串中找出连续最长数字串
import java.util.*;
public class Test26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.length() == 0) {
            return;
        }
        StringBuilder strMax = new StringBuilder();
        int i = 0;
        int len = str.length();
        while(i < len) {
            StringBuilder str2 = new StringBuilder();
            while(i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                char tmp = str.charAt(i);
                str2.append(tmp);
                i++;
            }
            if(str2.length() > strMax.length()) {
                strMax = str2;
            }
            i++;
        }
        System.out.print(strMax);
    }
}

