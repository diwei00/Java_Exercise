import java.util.Scanner;
//倒置字符串
public class Test25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        StringBuilder str2 = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--) {
            str2.append(arr[i]);
            str2.append(" ");

        }
        System.out.println(str2);
    }
}
