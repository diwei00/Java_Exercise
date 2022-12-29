//不使用加号计算加法
//按位异或为半加器：不进位加法（本位）
//按位与：可算进位（进位）
//两者相加。按位与需左移1位。相加即又需要计算本位和进位，依次循环，直到进位为0
class Solution48 {
    public int add(int a, int b) {
        while(b != 0) {
            int c = (a & b) << 1;//进位
            a ^= b;//本位
            b = c;
        }
        return a;

    }
}
public class add {
    public static void main(String[] args) {


    }
}
