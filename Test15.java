//数字三角形
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test15 {
    public static void fun(int[] arr, List<Integer> list) {

    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = (1 + n) * n / 2;
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        fun(arr, list);
    }
}
