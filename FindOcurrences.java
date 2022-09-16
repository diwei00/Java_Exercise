import java.util.Arrays;
//Bigram分词
class Solution28 {
    private String[] addCapicaty(String[] tmp) {
        int len = tmp.length;
        String[] ret = Arrays.copyOf(tmp, len + 1);
        return ret;
    }
    public String[] findOcurrences(String text, String first, String second) {
        String[] tmp2 = new String[0];
        int index = 0;
        int lenFirst = first.length();
        int lenSecond = second.length();
        String[] tmp = text.split(" ");
        for(int i = 0, j = 1; j < tmp.length - 1; i++, j++) {
            int len1 = tmp[i].length();
            int len2 = tmp[j].length();
            if(len1 != lenFirst || len2 != lenSecond) {
                continue;
            }
            if(first.equals(tmp[i]) && second.equals(tmp[j])) {
                tmp2 = addCapicaty(tmp2);
                tmp2[index++] = tmp[j + 1];
            }
        }
        return tmp2;
    }
}
public class FindOcurrences {
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        Solution28 solution28 = new Solution28();
        String[] ret = solution28.findOcurrences(text, first, second);
        System.out.println(Arrays.toString(ret));
    }
}
