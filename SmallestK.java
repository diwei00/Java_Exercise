//最小k个数
//TopK问题
//用前K个数据建大堆，后面数据依次和堆顶元素比较
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution65 {
    class IntCmp implements Comparator<Integer> {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    public int[] smallestK(int[] arr, int k) {
        if(k == 0) {
            return new int[0];
        }
        int[] arr2 = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new IntCmp());
        for(int i = 0; i < k; i++) {
            priorityQueue.offer(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            int tmp = priorityQueue.peek();
            if(arr[i] < tmp) {
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }
        for(int i = 0; i < k; i++) {
            arr2[i] = priorityQueue.poll();
        }
        return arr2;

    }
}
public class SmallestK {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        int k = 4;
        Solution65 solution65 = new Solution65();
        int[] ret = solution65.smallestK(arr, k);
        System.out.println(Arrays.toString(ret));

    }
}
