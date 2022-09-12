//删除有序数组中的重复项
//前后指针
import java.util.Arrays;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int prev = 0;
        int cur = 1;
        while(cur < nums.length) {
            if(nums[prev] == nums[cur]) {
                cur++;
            }else {
                nums[prev + 1] = nums[cur];
                prev++;
            }
        }
        return prev + 1;

    }
}
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        Solution26 solution26 = new Solution26();
        int ret = solution26.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
