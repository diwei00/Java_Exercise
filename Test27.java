//数字个数超过一半
import java.util.*;


public class Test27 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public static int MoreThanHalfNum_Solution(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) == null) {
                map.put(numbers[i], 1);
            } else {
                int tmp = map.get(numbers[i]);
                map.put(numbers[i], tmp + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> ret : set) {
            int tmp = ret.getValue();
            if (tmp > numbers.length / 2) {
                return ret.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        MoreThanHalfNum_Solution(arr);
    }

}

