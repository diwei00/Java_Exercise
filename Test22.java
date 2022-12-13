//组队竞赛
import java.util.*;
public class Test22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n * 3];
        for(int i = 0; i < n * 3; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[arr.length-(2*(i+1))];
        }
        System.out.println(sum);

    }
}

