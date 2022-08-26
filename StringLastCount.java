import java.io.InputStream;
import java.util.Scanner;
//字符串最后一个单词长度
public class StringLastCount {

    public  static void  main(String [] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length() - 1;
        int count = 0;
        for(int i = len; i >= 0; i--) {
            if(str.charAt(i) != ' ') {
                count++;
            }
            if(str.charAt(i) == ' ') {
                break;
            }
        }
        System.out.println(count);


    }
}
