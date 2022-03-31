import java.util.Scanner;

public class Main {
	static int[] w = { 3, 5 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cache = new int[n + 1];

		cache[0] = 0;
		for (int i = 1; i <= n; ++i)
			cache[i] = -1;

		for (int i = 0; i < 2; ++i)
			for (int weight = w[i]; weight <= n; ++weight)
				if (cache[weight] != -1 && cache[weight - w[i]] != -1)
					cache[weight] = Math.min(cache[weight], cache[weight - w[i]] + 1);
				else if (cache[weight - w[i]] != -1)
					cache[weight] = cache[weight - w[i]] + 1;

		System.out.println(cache[n]);
	}
}
