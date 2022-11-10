import java.util.*;
//前K个高频单词
class Solution67 {
    class cmp implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            //出堆顶元素时，会调整堆（在val一样时，先出字典序大的），需让向下调整时要交换
            if(o1.getValue().compareTo(o2.getValue()) == 0) {
                return o2.getKey().compareTo(o1.getKey());
            }
            return o1.getValue() - o2.getValue();
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        //利用HashMap统计单词个数
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            if(map.get(words[i]) == null) {
                map.put(words[i], 1);
            }else {
                int val = map.get(words[i]);
                map.put(words[i], val + 1);
            }
        }
        //建小堆，topK问题，遍历map
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(new cmp());
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for(Map.Entry<String, Integer> tmp: set) {
            if(minHeap.size() < k) {
                minHeap.offer(tmp);
            }else {
                int val = tmp.getValue();
                Map.Entry<String, Integer> top = minHeap.peek();
                if(val > top.getValue()) {
                    minHeap.poll();
                    minHeap.offer(tmp);
                }
                if(val == top.getValue()) {
                    //val相同时，入字典序小的
                    if(top.getKey().compareTo(tmp.getKey()) > 0) {
                        minHeap.poll();
                        minHeap.offer(tmp);
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();
        int size = minHeap.size();
        //会先出小的，需逆置
        while(size-- != 0) {
            list.add(minHeap.poll().getKey());
        }
        Collections.reverse(list);
        return list;

    }
}
public class TopKFrequent {
    public static void main(String[] args) {
        String[] arr = {"i","love","leetcode","i","love","coding"};
        Solution67 solution67 = new Solution67();
        solution67.topKFrequent(arr, 2);
    }

}
