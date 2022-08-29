class Solution4 {
    public String toLowerCase(String s) {
        if(s.length() == 0) {
            return null;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                char tmp = (char)(s.charAt(i) + 32);
                str.append(tmp);
            }else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();


    }
}
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "bhtjjjHH";
        Solution4 str = new Solution4();
        String ret = str.toLowerCase(s);
        System.out.println(ret);

    }
}
