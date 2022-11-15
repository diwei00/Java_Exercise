//最少刷题数
import java.util.Arrays;
public class Teas3 {
    /**
     * 统计比它多的学生数
     * @param x
     * @param arr
     * @param n
     * @return
     */
    private static int more(int x, int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            //不用比较自己
            if(i == n) {
                continue;
            }
            if(arr[i] > x) {
                count++;
            }
        }
        return count;
    }
    /**
     * 统计比他少的学生数
     * @param x
     * @param arr
     * @param n
     * @return
     */
    private static int less(int x, int[] arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == n) {
                continue;
            }
            if(arr[i] < x) {
                count++;
            }
        }
        return count;
    }
    public static int[] doExerciseCount(int n, int[] arr) {
        int[] ret = new int[n];
        for(int i = 0; i < arr.length; i++) {
            int more = more(arr[i], arr, i);
            int less = less(arr[i], arr, i);
            int count = 1;
            while(more > less) {
                more = more(arr[i] + count, arr, i);
                less = less(arr[i] + count, arr, i);
                count++;
            }
            ret[i] = count - 1;
        }
        return ret;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {12,10,15,20,6};
        int[] ret = doExerciseCount(n, arr);
        System.out.println(Arrays.toString(ret));
    }
}
