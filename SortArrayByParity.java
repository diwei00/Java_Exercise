import java.util.Arrays;
//按奇偶排序数组
class Solution8 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            right--;
            left++;
        }
        return nums;

    }
}

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution8 solution8 = new Solution8();
        int[] ret = solution8.sortArrayByParity(arr);
        System.out.println(Arrays.toString(ret));
    }
}
