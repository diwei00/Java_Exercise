import java.util.Arrays;
//合并两个有序数组
//归并排序
class Solution27 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                tmp[index++] = nums1[i];
                i++;
            }else {
                tmp[index++] = nums2[j];
                j++;

            }
        }
        while(i < m) {
            tmp[index++] = nums1[i++];
        }
        while(j < n) {
            tmp[index++] = nums2[j++];
        }
        for(int k = 0; k < m + n; k++) {
            nums1[k] = tmp[k];
        }

    }
}
public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = arr1.length - 3;
        int n = arr2.length;
        Solution27 solution27 = new Solution27();
        solution27.merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));

    }
}
