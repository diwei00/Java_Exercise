//蛇形填数
public class Test12 {
    public static void main(String[] args) {
        //规律：每一行开头不是j为0就是i为0
        int[][] arr = new int[100][100];
        int tmp = 1;
        int i = 0;
        int j = 0;
        for(int k = 0; k <= 90; k++) {
            if(i == 0 && j == 0) {
                arr[i--][j++] = tmp++;//结果j符合，i小1（两者交替出现）
            }else if(++i == 0) {//修正i后在判断
                int ret = k;
                while((ret + 1) != 0) {
                    arr[i++][j--] = tmp++;
                    ret--;
                }
            }else if(++j == 0) {//修正j后再判断
                int ret = k;
                //上面i会经过判断，需修正
                i--;
                while((ret + 1) != 0) {
                    arr[i--][j++] = tmp++;
                    ret--;
                }
            }
        }
        System.out.println(arr[19][19]);
    }
}
