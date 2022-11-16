import java.util.HashMap;
//卡片
public class Test5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 10; i++) {
            map.put(i, 2021);
        }
        int i = 1;
        boolean flag = false;
        while(true) {
            int tmp = i;
            while(tmp != 0) {
                int key = tmp % 10;
                Integer val = map.get(key);
                if(val == 0) {
                    flag = true;
                    break;
                }
                map.put(key, val - 1);
                tmp /= 10;
            }
            if(flag) {
                break;
            }
            i++;
        }
        //注意是上一个数字
        System.out.println(i - 1);


    }
}
