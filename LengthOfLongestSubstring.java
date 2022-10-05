import java.util.Arrays;
//无重复字符的最长字串
//滑动窗口
class Solution29 {
    public int lengthOfLongestSubstring(String s) {
        int[] flag = new int[128];
        int countMax = 0;
        int tmp = 0;
        for(int i = 0; i < s.length(); i++) {
            Arrays.fill(flag, 0);
            flag[s.charAt(i)]++;
            int count = 1;
            for(int j = i + 1; j < s.length(); j++) {
                if(flag[s.charAt(j)] == 1) {
                    break;
                }else {
                    flag[s.charAt(j)]++;
                    count++;
                }
            }
            if(count > countMax) {
                countMax = count;
            }
            tmp = count;
        }
        return countMax;
    }
}
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str = "nfpdmpi";
        Solution29 solution29 = new Solution29();
        int ret = solution29.lengthOfLongestSubstring(str);
        System.out.println(ret);

    }
}
