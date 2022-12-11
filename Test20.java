import java.util.Arrays;
import java.util.Random;
//随机填数
public class Test20 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        int prev = 1;
        Random random = new Random();
        arr[0] = random.nextInt(20);
        for(int i = 1; i < 7; i++) {
            int tmp;
            while (true) {
                tmp = random.nextInt(20);
                int j = 0;
                for(; j <= prev; j++) {
                    if(arr[j] == tmp) {
                        break;
                    }
                }
                if(j > prev) {
                    break;
                }
            }
            arr[i] = tmp;
            prev++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
