//删除回文子序列
//子序列不是字串（可以不连续）
class Solution12{
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }else {
                return 2;
            }
        }
        return 1;


    }
}
public class RemovePalindromeSub {
    public static void main(String[] args) {
        String str = "ababa";
        Solution12 s = new Solution12();
        int ret = s.removePalindromeSub(str);
        System.out.println(ret);
    }
}
