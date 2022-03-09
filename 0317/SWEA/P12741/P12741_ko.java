package Study_20220311_17;

import java.util.Scanner;

public class SWEA_12741_두전구 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int ans = Math.min(B, D) - Math.max(A, C);
			if (ans < 0)
				ans = 0;
			System.out.printf("#%d %d\n" , tc, ans);
		}
	}
}
