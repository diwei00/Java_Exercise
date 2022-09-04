//整数的各位积和之差
class Solution15 {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        int tmp = n;
        while(tmp != 0) {
            prod *= (tmp % 10);
            sum += (tmp % 10);
            tmp /= 10;
        }
        return prod - sum;

    }
}
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        int ret = solution15.subtractProductAndSum(234);
        System.out.println(ret);

    }
}
