//交换数组奇偶顺序
//前后指针
class Solution27 {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            while(left < right && nums[left] % 2 != 0) {
                left++;
            }
            while(left < right && nums[right] % 2 == 0) {
                right--;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;


    }
}
public class exchange {
}
