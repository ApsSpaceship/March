import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int GCD = gcd(a, b);
		System.out.println(GCD);
		System.out.println(a * b / GCD);
	}

	static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
