import java.util.Scanner;

public class Main {
	static int n, m;
	static int[] treeHeight;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		treeHeight = new int[n];

		for (int i = 0; i < n; ++i)
			treeHeight[i] = sc.nextInt();

		System.out.println(binarySearch());
	}

	static int binarySearch() {
		int lo = 0;
		int hi = 1000000000;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			long sum = 0;
			for (int i = 0; i < n; ++i)
				if (treeHeight[i] > mid)
					sum += (treeHeight[i] - mid);

			if (sum >= m)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return hi;
	}
}
