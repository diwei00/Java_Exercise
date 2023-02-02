//斐波那契数列
//动态规划
class Solution16 {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if(n == 0) {
            return a;
        }
        if(n == 1) {
            return b;
        }
        int c = 0;
        while(n-- - 1 != 0) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return c;


    }
}
public class fib {
}
