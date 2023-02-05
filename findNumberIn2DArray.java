//二维数组中查找数字
//确定行后二分
//行和列同时变O(n + m)
class Solution7 {
    public boolean binarySearch(int[][] matrix, int row, int col, int target) {
        int left = 0;
        int right = col - 1;
        while(left <= right) {
            int mid = (left + right) >> 1;
            if(matrix[row][mid] > target) {
                right = mid - 1;
            }else if(matrix[row][mid] < target) {
                left = mid + 1;
            }else {
                return true;
            }
        }
        return false;
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0)  {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) {
            if(binarySearch(matrix, i, col, target)) {
                return true;
            }
        }
        return false;
    }
    //行列同时变
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int row = matrix.length;
        if(row == 0) {
            return false;
        }
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        while(i < row && j >= 0) {
            if(matrix[i][j] > target) {
                j--;
            }else if(matrix[i][j] < target) {
                i++;
            }else {
                return true;
            }
        }
        return false;

    }
}
public class findNumberIn2DArray {
}
