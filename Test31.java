import java.util.Scanner;

//最大连续和
//动态规划
//以每个数据为节点，计算之前的最大连续和，为下一次计算做铺垫
public class Test31 {

    //贪心
    //局部最优得到全局最优（数组中找最大值）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            max = Math.max(sum, max);

            //对结果增益，重新计算
            if(sum < 0) {
                sum = 0;
            }
        }

    }

    //动态规划
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        int max = dp[0];
        for(int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);

            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
