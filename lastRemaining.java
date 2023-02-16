import java.util.ArrayList;
import java.util.List;
//圆圈中最后剩下的数字
//约瑟夫环问题
//利用ArrayList模拟循环数组。计算下标
class Solution54 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1) {
            index = (index + m - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);


    }
}
public class lastRemaining {
}
