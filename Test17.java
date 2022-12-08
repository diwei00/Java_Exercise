//成绩统计
//2020省赛
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Test17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int a = 0;
        int b = 0;
        for(int i = 0; i < n; i++) {
            int tmp = scan.nextInt();
            if(tmp >= 60) {
                a++;
            }
            if(tmp >= 85) {
                b++;
            }

        }
        //四舍五入，取整(lang)
        System.out.println(Math.round(a * 1.0 * 100 / n) + "%");
        System.out.println(Math.round(b * 1.0 * 100 / n) + "%");



        scan.close();
    }
}

