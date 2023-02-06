import java.util.HashMap;
//数组中重复的数字
//利用Hashmap计数
class Solution4 {
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            }else {
                return nums[i];
            }
        }
        return -1;

    }
}
public class findRepeatNumber {

}
