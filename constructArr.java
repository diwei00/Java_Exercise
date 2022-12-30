//构建乘积数组（不包含本位数的乘积）
//先构建本位左面数的乘积，然后反向遍历构建右面数的乘积
class Solution52 {
    public int[] constructArr(int[] a) {
        int tmp = 1;
        int[] arr = new int[a.length];
        //左面
        for(int i = 0; i < a.length; i++) {
            arr[i] = tmp;
            tmp *= a[i];
        }
        //反向遍历，右面
        tmp = 1;
        for(int i = a.length - 1; i >= 0; i--) {
            arr[i] *= tmp;
            tmp *= a[i];
        }
        return arr;



    }
}
public class constructArr {
}
