//检查整数及其两倍数是否存在
class Solution16 {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] * 2 == arr[j]
                        || arr[j] * 2 == arr[i]){
                    return true;
                }
            }
        }

        return false;

    }
}
public class CheckIfExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        Solution16 solution16 = new Solution16();
        boolean ret = solution16.checkIfExist(arr);
        System.out.println(ret);
        int a = 10;
        int b = 20;
        System.out.println(Math.abs(a - b));
    }
}
