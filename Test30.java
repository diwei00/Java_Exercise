//统计回文
import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count = 0;
        for(int i = 0; i <= str1.length(); i++) {
            StringBuilder tmp = new StringBuilder();
            if(i == 0) {
                tmp.append(str2);
                tmp.append(str1);
            }else if(i == str1.length()){
                tmp.append(str1);
                tmp.append(str2);
            }else {
                String left = str1.substring(0, i);
                String right = str1.substring(i, str1.length());
                tmp.append(left);
                tmp.append(str2);
                tmp.append(right);
            }
            if(isPalinString(tmp.toString())) {
                count++;
            }
        }
        System.out.println(count);

    }
    private static boolean isPalinString(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
