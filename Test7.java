import java.util.ArrayList;
import java.util.List;
//求因数，枚举
public class Test7 {
    public static void main(String[] args) {
        long n = 2021041820210418L;
        List<Long> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                list.add((long)i);
                list.add(n / i);
            }
        }
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(i * j > n) {
                    continue;
                }
                for(int k = 0; k < list.size(); k++) {
                    if(list.get(i) * list.get(j) * list.get(k) == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
