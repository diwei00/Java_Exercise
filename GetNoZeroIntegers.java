import java.util.Arrays;

//将整数转换为两个无0整数的和
//枚举法
class Solution21 {
    private boolean isHaveZero(int n) {
        while(n != 0) {
            if(n % 10 == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        int i = 1;
        while(true) {
            int tmp = (n - i);
            if(isHaveZero(tmp) || isHaveZero(i)) {
                i++;
            }else {
                arr[0] = i;
                arr[1] = (n - i);
                break;
            }
        }
        return arr;
    }
}
public class GetNoZeroIntegers {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        int[] ret = solution21.getNoZeroIntegers(1010);
        System.out.println(Arrays.toString(ret));
    }
}
