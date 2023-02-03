import java.util.*;
//和为s的连续整数序列
//滑动窗口
//和比s小，则需要扩大窗口
//和比s大，则需要缩小窗口
//相等则入，且这个连续序列头已经使用，即缩小窗口即可
class Solution53 {
    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> list = new ArrayList<>();

        while(i <= target / 2) {
            if(sum < target) {
                sum += j;
                j++;
            }else if(sum > target) {
                sum -= i;
                i++;
            }else {
                int[] tmp = new int[j - i];
                int index = 0;
                for(int k = i; k < j; k++) {
                    tmp[index++] = k;
                }
                list.add(tmp);
                sum -= i;
                i++;
            }
        }
        return list.toArray(new int[0][]);


    }
}
public class findContinuousSequence {
}
