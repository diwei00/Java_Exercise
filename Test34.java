import java.util.Scanner;
//斐波那契数列
public class Test34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int c = a + b;
        while (true) {
            if(n >= a && n < b || n > a && n <= b) {
                break;
            }
            a = b;
            b = c;
            c = a + b;
        }
        if(n - a > b - n) {
            System.out.println(b - n);
        }else {
            System.out.println(n - a);
        }
    }
}
