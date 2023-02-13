import java.util.Arrays;
import java.util.PriorityQueue;

//扑克牌中的顺子
//无重复
//max < min < 5不包含0
class Solution36 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 0) {
                count++;
                continue;
            }
            if(nums[i] == nums[i + 1]) {
                return false;
            }

        }
        return nums[4] - nums[count] < 5;


    }
}
public class isStraight {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);

    }
}
