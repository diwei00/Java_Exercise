class Solution1 {
    //统计位数为偶数的数字
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] != 0) {
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}
public class FindNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 88, 99, 999, 7896, 6587, 5623};
        Solution1 exer1 = new Solution1();
        int ret = exer1.findNumbers(arr);
        System.out.println(ret);

    }
}
