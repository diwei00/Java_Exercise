//二进制中1的个数
//和1按位与，然后右移即可
class Solution47 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if(((n >> i) & 1) == 1) {
                count++;
            }
        }
        return count;


    }
}
public class hammingWeight {
}
