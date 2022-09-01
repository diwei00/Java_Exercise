import java.util.Arrays;
//数组相对排序
class Solution9 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        int index = 0;
        for(int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }
        for(int i = 0; i < arr2.length; i++) {
            int tmp = count[arr2[i]];
            while(tmp-- != 0) {
                arr1[index++] = arr2[i];
            }
            count[arr2[i]] = 0;
        }
        for(int i = 0; i < 1001; i++) {
            if(count[i] != 0) {
                int tmp = count[i];
                while(tmp-- != 0) {
                    arr1[index++] = i;
                }
            }
            //优化操作
            if(index == arr1.length) {
                break;
            }
        }
        return arr1;

    }
}
public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        Solution9 solution9 = new Solution9();
        int[] ret = solution9.relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(ret));
    }
}
