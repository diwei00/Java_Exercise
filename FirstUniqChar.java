//字符串中第一个唯一字符
class Solution {
    public int firstUniqChar2(String s) {
        int[] arr = new int[256];
        //统计字符个数
        for(int i = 0; i < s.length() ; i++) {
            arr[s.charAt(i)]++;
        }
        //以字符串顺序遍历
        for(int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
    public int firstUniqChar(String s) {
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                continue;
            }
            int flag = 1;
            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(j) == '*') {
                    continue;
                }
                if(str.charAt(i) == str.charAt(j)){
                    str.setCharAt(j,'*');
                    flag = 0;
                }
            }
            if(flag == 1) {
                return i;
            }

        }
        return -1;

    }
}
public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        Solution solution = new Solution();
        int ret = solution.firstUniqChar(s);
        System.out.println(ret);

    }
}
