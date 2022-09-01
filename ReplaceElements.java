import java.util.Arrays;
//将每个元素替换为右侧最大元素
class Solution10 {
    public int[] replaceElements(int[] arr) {
        int[] pa = new int[arr.length];
        int index = 0;
        if(arr.length == 1) {
            pa[0] = -1;
            return pa;
        }
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                break;
            }
            int max = arr[i + 1];
            for(int j = i + 2; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            pa[index++] = max;

        }
        pa[index++] = -1;

        return pa;
    }

}
public class ReplaceElements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        Solution10 solution10 = new Solution10();
        int[] ret = solution10.replaceElements(arr);
        System.out.println(Arrays.toString(ret));
    }
}
