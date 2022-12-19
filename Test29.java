//进制转化
import java.util.*;
public class Test29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[2];
        for(int i = 0; i < 2; i++) {
            arr[i] = scan.nextInt();
        }
        StringBuilder str = new StringBuilder();
        int tmp = Math.abs(arr[0]);
        int ret = arr[1];
        while(tmp != 0) {
            int ret2 = tmp % ret;
            char tmp2 = 'a';
            switch(ret2) {
                case 10:
                    tmp2 = 'A';
                    break;
                case 11:
                    tmp2 = 'B';
                    break;
                case 12:
                    tmp2 = 'C';
                    break;
                case 13:
                    tmp2 = 'D';
                    break;
                case 14:
                    tmp2 = 'E';
                    break;
                case 15:
                    tmp2 = 'F';
                    break;
            }
            if(ret2 <= 9) {
                str.append(ret2);
            }else {
                str.append(tmp2);
            }

            tmp /= ret;
        }
        if(arr[0] > 0) {
            System.out.print(str.reverse());
        }else if(arr[0] < 0){
            System.out.println("-" + str.reverse());
        }else {
            System.out.print("0");
        }

    }
}

