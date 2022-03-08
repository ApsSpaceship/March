import java.util.Scanner;

public class Main {
	static boolean[] notPrime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		notPrime = new boolean[n + 1];
		notPrime[1] = true;
		for (int i = 2; i <= n; ++i)
			if (!notPrime[i]) {
				if (i >= m)
					System.out.println(i);
				for (int j = i * 2; j <= n; j += i)
					notPrime[j] = true;
			}
	}
}
