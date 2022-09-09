//整数反转
class Solution18 {
    public int reverse(int x) {
        int flag = 0;
        if(x < 0) {
            flag = 1;
            x = -x;
        }
        int[] arr = new int[6];
        int index = 0;
        int tmp = x;
        int count = 0;
        while(tmp != 0) {
            count++;
            arr[index++] = (tmp % 10);
            tmp /= 10;
        }

        long sum = 0;
        for(int i = 0; i < index; i++) {
            sum += arr[i] * (Math.pow(10, --count));
        }
        if(flag != 0) {
            sum = (-sum);
        }
        if(sum >= Math.pow(2, 31) - 1 ||
                sum <= -(Math.pow(2, 31))) {
            return 0;
        }
        return (int)sum;



    }
}
public class Reverse {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int ret = solution18.reverse(-123);
        System.out.println(ret);

    }
}
