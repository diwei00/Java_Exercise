
import java.util.Scanner;
//等差素数列  2017省赛
// 1:无需package
// 2: 类名必须Main, 不可修改
public class Test18 {
    public static boolean isPrime(int tmp) {
        for(int i = 2; i < Math.sqrt(tmp); i++) {
            if(tmp % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //在此输入您的代码...
        //数列第一项范围
        for(int i = 1; i < 10000; i++) {
            for(int j = 1; j < 1000; j++) {//公差范围
                int k = 0;
                for(k = 0; k < 10; k++) {//10个数据
                    if(!isPrime(i + k * j)) {//由于从0开始，因此不需要加1
                        break;
                    }
                }
                if(k == 10) {
                    System.out.println(j);
                    return;
                }
            }
        }


    }
}

