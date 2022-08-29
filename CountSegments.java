class Solution3 {
    public int countSegments(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 || s.charAt(i - 1) == ' '
                    && s.charAt(i) != ' ' ) {
                if(i == 0 && s.charAt(i) != ' ') {
                    count++;

                }
                if(i != 0) {
                    count++;
                }

            }
        }
        return count;

    }
}
public class CountSegments {
    public static void main(String[] args) {
        String str = "abc def   ht";
        Solution3 solution3 = new Solution3();
        int ret = solution3.countSegments(str);
        System.out.println(ret);


    }
}

