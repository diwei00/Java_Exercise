//移除元素
import java.util.Arrays;

class Solution25 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                count++;
            }
        }
        int tmp = count;
        int i = 0;
        while(count-- != 0) {
            while(nums[i] != val) {
                i++;
            }
            for(int index = i; index < nums.length - 1; index++) {
                nums[index] = nums[index + 1];
            }


        }
        return nums.length - tmp;

    }
}
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        Solution25 solution25 = new Solution25();
        int ret = solution25.removeElement(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
