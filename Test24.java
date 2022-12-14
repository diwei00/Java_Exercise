//排序子序列
import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //防止越界
        int[] arr = new int[n + 1];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        int j = 0;
        while(j < n) {
            if(arr[j] < arr[j + 1]) {
                //非递减序列
                while(j + 1 < n && arr[j] < arr[j + 1]) {
                    j++;
                }
                count++;
                j++;
            }else if(arr[j] == arr[j + 1]) {//相等就跳过
                j++;
            }else {
                //非递增序列
                while(j + 1 < n && arr[j] > arr[j + 1]) {
                    j++;
                }
                count++;
                j++;
            }
        }
        System.out.print(count);


    }
}
