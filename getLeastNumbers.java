import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
//最小的k个数
//topK问题，建大堆
class Solution37 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        for(int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            int tmp = maxHeap.peek();
            if(arr[i] < tmp) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }
        int[] arr2 = new int[maxHeap.size()];
        for(int i = 0; i < maxHeap.size(); i++) {
            arr2[i] = maxHeap.poll();
        }
        return arr2;


    }
}
public class getLeastNumbers {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        Solution37 solution37 = new Solution37();
        solution37.getLeastNumbers(arr, 2);
        LinkedList<Integer> list = new LinkedList<>();

    }
}
