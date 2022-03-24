package Study_20220318_24;

import java.util.Scanner;

public class BOJ_2775_부녀회장이될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[] floor = new int[n + 1]; // n호까지 사용, 맨앞호수 범위 고려
			for (int i = 1; i <= n; i++) // 0층 초기화
				floor[i] = i;

			for (int i = 1; i <= k; i++) // 1층부터 앞호수 + 전층같은호수 
				for (int j = 1; j <= n; j++)
					floor[j] = floor[j - 1] + floor[j];

			System.out.println(floor[n]);
		}
	}
}
