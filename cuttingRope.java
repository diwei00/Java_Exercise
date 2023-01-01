//剪绳子
//动态规划
//状态定义：dp[i]为i的最大乘积
//转移方程：设先剪j剩余为i - j，（i- j）不剪就是j * (i - j)，剪的话就是j * dp[i - j]
//初始化：dp[0] = dp[1] = 0，无法剪。dp[2] = 1确定的数
//返回值：dp[n]
class Solution55 {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        int max = 0;
        for(int i = 3; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = max;
        }
        return dp[n];



    }
}
public class cuttingRope {
}
