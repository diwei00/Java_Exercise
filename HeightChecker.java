import java.util.Arrays;
//高度检查器
class Solution24 {
    public int heightChecker(int[] heights) {
        int[] tmp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(tmp[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
public class HeightChecker {
    public static void main(String[] args) {
        int[] height = {1,1,4,2,1,3};
        Solution24 solution24 = new Solution24();
        int ret = solution24.heightChecker(height);
        System.out.println(ret);

    }
}
