//特别萝卜位置数
public class Test33 {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 1}, {1, 0, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}};
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int k = 0;
                //行
                for (; k < col; k++) {
                    if (k == j) {
                        continue;
                    }
                    if (arr[i][k] != 0) {
                        break;
                    }
                }

                //列
                int p = 0;
                for (; p < row; p++) {
                    if (p == i) {
                        continue;
                    }
                    if (arr[p][j] != 0) {
                        break;
                    }
                }
                if (p == row && k == col) {
                    count++;
                }
            }

        }
        System.out.println(count);


    }
}
