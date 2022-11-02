//最长回文字串
//中心扩散法
//1.遍历字符串（以每个字符为中心），左右扩散完相同字符（字符一样一定为回文串）
//2.左右同时遍历，寻找一样的字符
//3.记录长度最大的串
class Solution74 {
    public String longestPalindrome(String s) {
        int strlen = s.length();
        int maxLeft = 0;
        int maxRight = 0;
        int len = 0;
        for(int i = 0; i < strlen; i++) {
            int left = i;
            int right = i;
            while(left - 1 >= 0 && s.charAt(left - 1) == s.charAt(i)) {
                left--;
            }
            while(right + 1 <= strlen - 1 && s.charAt(right + 1) == s.charAt(i)) {
                right++;
            }
            while(left - 1 >= 0 && right + 1 <= strlen - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }
            if(right - left + 1 > len) {
                maxLeft = left;
                maxRight = right;
                len = maxRight - maxLeft + 1;
            }
        }
        //左闭右开区间
        return s.substring(maxLeft, maxRight + 1);
    }
}
public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "babad";
        Solution74 solution74 = new Solution74();
        String ret = solution74.longestPalindrome(str);
        System.out.println(ret);
    }
}
