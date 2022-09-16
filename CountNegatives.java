//统计有序矩阵中的负数
//二分法查找第一个负数
class Solution22 {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            int pos = -1;
            int left = 0;
            int right = col - 1;
            while(left <= right) {
                int mid = (left + right) >> 1;
                if(grid[i][mid] < 0) {
                    pos = mid;
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            if(pos != -1) {
                count += (col - pos);
            }
        }
        return count;


    }
}
public class CountNegatives {
    public static void main(String[] args) {
        int[][] arr = {{3,2},{1,0}};
        Solution22 solution22 = new Solution22();
        int ret = solution22.countNegatives(arr);
        System.out.println(ret);
    }
}
