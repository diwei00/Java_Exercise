//不要2
//设置标志位法
import java.util.Scanner;
public class Test37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    count++;
                    if(j + 2 < m) {
                        arr[i][j + 2] = 1;
                    }
                    if(i + 2 < n) {
                        arr[i + 2][j] = 1;
                    }
                }

            }
        }
        System.out.println(count);



    }
}

