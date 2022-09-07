import java.util.Arrays;
//轮转数组
class Solution23 {
    public void rotate(int[] nums, int k) {
        if(k > nums.length) {
            int len = nums.length;

            while(k-- != 0) {
                int end = nums[len - 1];
                for(int i = len - 1; i > 0; i--) {
                    nums[i] = nums[i - 1];
                }
                nums[0] = end;
            }
            return;
        }
        int[] arr = new int[k];
        int tmp = k - 1;
        int tmp2 = k;
        int endLen = nums.length - 1;
        while(tmp2-- != 0) {
            arr[tmp--] = nums[endLen--];
        }
        int pos = endLen;
        for(int i = pos; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for(int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
    }
}
public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Solution23 solution23 = new Solution23();
        solution23.rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
