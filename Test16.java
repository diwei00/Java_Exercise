//单词分析
import java.util.Scanner;
public class Test16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            arr[tmp - 'a']++;
        }
        int max = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println((char)(max + 'a'));
        System.out.print(arr[max]);
        scan.close();
    }
}
