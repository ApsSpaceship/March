package Study_20220304_10;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1920_수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		int start;
		int end;
		int mid;
		int now = 0;

		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		Arrays.sort(nums);

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {// 이진 탐색
			now = sc.nextInt();
			start = 0;
			end = N - 1;
			mid = 0;
			while (start <= end) {
				mid = (end + start) / 2;
				if (nums[mid] == now)
					break;
				else if (nums[mid] > now) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			if (nums[mid] == now) // 찾았다면
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
