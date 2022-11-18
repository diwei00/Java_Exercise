import java.util.HashSet;
//直线
public class Test6 {
    private static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        int c = a % b;
        while(c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        for(int a1 = 0; a1 < 20; a1++) {
            for(int b1 = 0; b1 < 21; b1++) {
                for(int a2 = 0; a2 < 20; a2++) {
                    for(int b2 = 0; b2 < 21; b2++) {
                        //斜率不存在和斜率为0
                        if(a1 == a2 || b1 == b2) {
                            continue;
                        }
                        //以分子和分母形式存储k和b，需保证其最简形式
                        StringBuilder str = new StringBuilder();
                        int up = b2 - b1;
                        int down = a2 - a1;
                        int tmp = gcd(up, down);
                        //append形参是String类型，需将数字转换为String
                        str.append(up / tmp + " ");
                        str.append(down/ tmp + " ");

                        up = b1 * down - a1 * up;
                        tmp = gcd(up, down);
                        str.append(up / tmp + " ");
                        str.append(down/ tmp + " ");

                        set.add(str.toString());
                    }
                }
            }
        }
        //斜率为0有21条，斜率不存在为20条
        System.out.println(set.size() + 20 + 21);
    }
}
