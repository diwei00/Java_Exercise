//单词分析
//topk问题
import java.util.*;

public class Test14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        //统计单词个数
        for(int i = 0; i < str.length(); i++) {
            char ret = str.charAt(i);
            if(map.get(ret) == null) {
                map.put(ret, 1);
            }else {
                int tmp = map.get(str.charAt(i));
                map.put(str.charAt(i), tmp + 1);
            }
        }
        Set<Map.Entry<Character, Integer>> set =  map.entrySet();
        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>();
        int k = 1;
        for(Map.Entry<Character, Integer> entry : set) {
            if(heap.size() < k) {
                heap.offer(entry);
            }else {
                Map.Entry<Character, Integer> top = heap.peek();
                //换val值大的
                if(entry.getValue() > top.getValue()) {
                    heap.poll();
                    heap.offer(entry);
                }
                if((int)entry.getValue() == top.getValue()) {
                    //比较字典序
                    if(entry.getKey() < top.getKey()) {
                        heap.poll();
                        heap.offer(entry);
                    }
                }
             }
        }
        Map.Entry<Character, Integer> tmp = heap.poll();
        System.out.println(tmp.getKey());
        System.out.println(tmp.getValue());
    }
}
