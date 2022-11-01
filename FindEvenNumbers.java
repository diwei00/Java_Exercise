import java.util.*;
//找出三位偶数
//枚举，set去重
class Solution71 {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < digits.length; i++) {
            for(int j = 0; j < digits.length; j++) {
                if(j == i) {
                    continue;
                }
                for(int k = 0; k < digits.length; k++) {
                    if(k == i || k == j) {
                        continue;
                    }
                    int tmp = digits[i] * 100
                            + digits[j] * 10 + digits[k];
                    if(tmp >= 100) {
                        if(tmp % 2 == 0) {
                            set.add(tmp);
                        }
                    }
                }
            }
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for(int x : set) {
            arr[i++] = x;
        }
        Arrays.sort(arr);
        return arr;
    }
}
public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {2,1,3,0};
        Solution71 solution71 = new Solution71();
        int[] ret = solution71.findEvenNumbers(arr);
        System.out.println(Arrays.toString(ret));


    }
}
