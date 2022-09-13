//找出数组中的幸运数
class Solution14 {
    public int findLucky(int[] arr) {
        int[] pa = new int[501];
        for(int i = 0; i < arr.length; i++) {
            pa[arr[i]]++;
        }
        int max = -1;
        for(int i = 1; i < pa.length; i++) {
            if(i == pa[i]) {
                if(i > max) {
                    max = i;
                }
            }
        }
        return max;

    }
}
public class FindLucky {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        Solution14 solution14 = new Solution14();
        int ret = solution14.findLucky(arr);
        System.out.println(ret);

    }
}
