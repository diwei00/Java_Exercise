//消失的数字
class Solution19 {
    public int missingNumber(int[] nums) {

        int[] arr = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for(int i = 0; i < nums.length + 1; i++) {
            if(arr[i] == 0) {
                return i;
            }
        }
        return -1;

    }
}
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,0};
        Solution19 solution19 = new Solution19();
        int ret = solution19.missingNumber(arr);
        System.out.println(ret);

    }
}
