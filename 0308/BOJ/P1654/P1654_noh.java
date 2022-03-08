import java.util.Scanner;

public class Main {
	static int k;
	static int n;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		n = sc.nextInt();
		arr = new int[k];

		for (int i = 0; i < k; ++i)
			arr[i] = sc.nextInt();

		System.out.printf("%d", binarySearch(0, Integer.MAX_VALUE));
	}

	static boolean solve(long len) {
		long sum = 0;

		for (int i = 0; i < k; ++i)
			sum += (arr[i] / len);

		return sum >= n;
	}

	static long binarySearch(long lo, long hi) {
		while (lo <= hi) {
			long mid = (lo + hi) / 2;

			if (solve(mid))
				lo = mid + 1;
			else
				hi = mid - 1;
		}

		return hi;
	}
}
