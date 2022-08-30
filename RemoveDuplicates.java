//删除字符串中所有重复项
class Solution6 {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean flag = true;
        while (flag) {
            int i = 0;
            int flag2 = 0;
            for (i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 2);
                    flag2 = 1;
                    break;
                }
            }
            if (flag2 == 0 || str.length() == 0) {
                flag = false;
            }
        }
        return str.toString();
    }
}
class Solution7 {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();

        int endLen = 0;
        for(int i = 0; i < s.length(); i++) {
            if(str.length() != 0) {
                endLen = str.length() - 1;
            } else {
                endLen = str.length();
            }
            if(str.length() != 0) {
                if(s.charAt(i) == str.charAt(endLen)) {
                    str.deleteCharAt(endLen);
                }else {
                    str.append(s.charAt(i));
                }
            } else {
                str.append(s.charAt(i));
            }


        }
        return str.toString();
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        Solution7 solution7 = new Solution7();
        String ret = solution7.removeDuplicates(s);
        System.out.println(ret);
    }
}