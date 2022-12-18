//计算糖果
import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = 0;
        int b1 = 0;
        int b2 = 0;
        int c = 0;
        int sum1 = arr[0] + arr[2];
        a = sum1 / 2;
        b1 = arr[2] - a;

        int sum2 = arr[1] + arr[3];
        b2 = sum2 / 2;
        c = arr[3] - b2;
        if(b1 == b2) {
            System.out.println(a + " " + b1 + " " + c);

        }else {
            System.out.println("No");
        }
    }
}
