//字符集合
import java.util.Scanner;
public class CharSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            char[] arr = new char[100];
            int index = 0;

            String str = scan.nextLine();
            arr[index++] = str.charAt(0);
            for(int i = 1; i < str.length(); i++) {
                int j = 0;
                for(j = 0; j < index; j++) {
                    if(str.charAt(i) == arr[j]) {
                        break;
                    }
                }
                if(j == index) {
                    arr[index++] = str.charAt(i);
                }
            }
            for(int i = 0; i < index; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }
}
