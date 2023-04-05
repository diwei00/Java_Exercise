package lanqiao;
//8次求和
import java.math.BigInteger;
import java.util.*;
public class Main10 {
	public static BigInteger fun(int tmp) {
		BigInteger m = BigInteger.valueOf(tmp);
		m = m.multiply(m);
		m = m.multiply(m);
		m = m.multiply(m);
		return m;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BigInteger tmp = BigInteger.valueOf(123456789);
		BigInteger sum = BigInteger.ZERO;
		for(int i = 1; i <= n; i++) {
			sum = sum.add(fun(i)).mod(tmp);
		}
		System.out.print(sum);
	}

}
