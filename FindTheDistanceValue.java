//两个数组间的距离值
class Solution17 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i = 0; i < arr1.length; i++) {
            int j = 0;
            for(j = 0; j < arr2.length; j++) {
                if(Math.abs(arr1[i] - arr2[j]) <= d) {
                    break;
                }
            }
            if(j == arr2.length) {
                count++;
            }
        }
        return count;

    }
}
public class FindTheDistanceValue {
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        Solution17 solution17 = new Solution17();
        int ret = solution17.findTheDistanceValue(arr1, arr2, 2);
        System.out.println(ret);

    }
}
