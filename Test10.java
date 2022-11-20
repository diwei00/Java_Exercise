//门牌制作
public class Test10 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 2020; i++) {
            int tmp = i;
            while(tmp != 0) {
                if(tmp % 10 == 2) {
                    count++;
                }
                tmp /= 10;
            }
        }
        System.out.println(count);
    }
    //624
}
