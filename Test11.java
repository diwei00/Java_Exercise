//寻找2020
public class Test11 {
    public static void main(String[] args) {
        int[][] arr = {{2,2,0,0,0,0},{0,0,0,0,0,0},{0,0,2,2,0,2},{0,0,0,0,0,0},{0,0,0,0,2,2},{0,0,2,0,2,0}};
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                //行
                if(j + 3 < col && arr[i][j] == 2 && arr[i][j + 1] == 0 && arr[i][j + 2] == 2 && arr[i][j + 3] == 0) {
                    count++;
                }
                //列
                if(i + 3 < row && arr[i][j] == 2 && arr[i + 1][j] == 0 && arr[i + 2][j] == 2 && arr[i + 3][j] == 0) {
                    count++;
                }
                //对角
                if(i + 3 < row && j + 3 < col && arr[i][j] == 2 && arr[i + 1][j + 1] == 0 && arr[i + 2][j + 2] == 2 && arr[i + 3][j + 3] == 0) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
