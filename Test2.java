//山
public class Test2 {
    private static boolean isPalin(int a) {
        int[] arr = new int[10];
        int index = 0;
        int count = 0;
        while(a != 0) {
            arr[index++] = (a % 10);
            a /= 10;
            count++;
        }

        int begin = 0;
        int end = index - 1;
        while(begin <= end) {
            if(arr[begin] != arr[end]) {
                return false;
            }
            begin++;
            end--;
        }
        int mid = count >> 1;
        if(count % 2 == 0) {
            for (int i = 0; i < mid - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        }else {
            for (int i = 0; i < mid; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        }
        return true;

    }
    private static int palinCount(int begin, int end) {
        int count = 0;
        for(int i = begin; i <= end; i++) {
            if(isPalin(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 2022;
        int b = 2022222022;
        int count = palinCount(a, b);
        System.out.println(count);

    }
}
