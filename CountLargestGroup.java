//统计最大组的数目
//和最大为36，直接开数组，进行统计每个组中数字个数
class Solution13 {
    public int countLargestGroup(int n) {
        int[] arr = new int[37];
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int tmp = i;
            while(tmp != 0) {
                sum += (tmp % 10);
                tmp /= 10;
            }
            arr[sum]++;
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                count++;
            }
        }
        return count;

    }
}
public class CountLargestGroup {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int ret = solution13.countLargestGroup(13);
        System.out.println(ret);
    }
}
