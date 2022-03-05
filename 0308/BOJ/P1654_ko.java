package Study_20220304_10;

import java.util.Scanner;

public class BOJ_1654_랜선자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] lan = new int[K];
		long end = 0;
		long start = 1; // 최솟값은 1
		long mid;
		int cnt;

		for (int i = 0; i < K; i++) {
			lan[i] = sc.nextInt();
			end = Math.max(end, lan[i]); // 길이의 최댓값
		}

		while (start <= end) { // 이분 탐색
			mid = (end + start) / 2;
			cnt = 0;
			for (int i = 0; i < K; i++) { // 자른 랜선 개수 세기
				cnt += lan[i] / mid;
			}
			if (cnt < N) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		System.out.print(end);
	}

}
