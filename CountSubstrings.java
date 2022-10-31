//统计只差一个字符的子串数目
//暴力枚举
class Solution73 {
    public int countSubstrings(String s, String t) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < t.length(); j++) {
                int k = 0;
                int tmp = 0;
                while(i + k < s.length() &&
                        j + k < t.length()) {
                    if(s.charAt(i + k) != t.charAt(j + k)) {
                        tmp++;
                    }
                    if(tmp > 2) {
                        break;
                    }
                    if(tmp == 1) {
                        count++;
                    }

                    k++;
                }

            }
        }
        return count;

    }
}
public class CountSubstrings {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "bb";
        Solution73 solution73 = new Solution73();
        solution73.countSubstrings(str1, str2);

    }
}
