//有序数组中出现次数超过25%的元素
class Solution11 {
    public int findSpecialInteger(int[] arr) {

        //边统计边判断
        int n = (arr.length / 4);
        int count = 0;
        int tmp = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == tmp) {
                count++;
                if(count > n) {
                    return tmp;
                }
            }else {
                tmp = arr[i];
                count = 1;
            }
        }
        return -1;


    }
}
public class FindSpecialInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        Solution11 solution11 = new Solution11();
        int ret = solution11.findSpecialInteger(arr);
        System.out.println(ret);
    }


}
