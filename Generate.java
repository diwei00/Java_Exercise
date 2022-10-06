import java.util.List;
import java.util.ArrayList;
//杨辉三角
class Solution30 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmp1 = new ArrayList<>();
        tmp1.add(1);
        list.add(tmp1);
        for(int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int j = 0; j < i - 1; j++) {
                int ret = list.get(i - 1).get(j + 1) +
                        list.get(i - 1).get(j + 1 - 1);
                tmp.add(ret);
            }
            tmp.add(1);
            list.add(tmp);

        }
        return list;

    }
}
public class Generate {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        List<List<Integer>> ret = solution30.generate(20);
        for(int i = 0; i < ret.size(); i++) {
            for(int j = 0; j < ret.get(i).size(); j++) {
                int num = ret.get(i).get(j);
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }

}
