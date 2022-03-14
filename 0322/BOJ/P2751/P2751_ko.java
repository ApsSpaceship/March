package Study_20220318_24;

import java.util.Scanner;

public class BOJ_2751_수정렬하기2 {
  //카운팅정렬사용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 숫자 수 입력
		int k = -1; // k 초기화
		int[] nums = new int[N];

		for (int i = 0; i < N; i++) { // N만큼 숫자 입력
			nums[i] = sc.nextInt() + 1000000;
			k = Math.max(k, nums[i]); // k:최댓값
		}

		int[] cntSum = new int[k + 1]; // k까지 인덱스 사용 예정, 누적합 배열
		int[] sorted = new int[N]; // 정렬 배열 숫자 수 만큼 생성

		for (int i = 0; i < N; i++)
			cntSum[nums[i]]++; // 숫자 각각 개수 세기

		for (int i = 1; i <= k; i++) // 누적합 배열
			cntSum[i] += cntSum[i - 1];

		for (int i = N - 1; i >= 0; i--) // 뒤에서부터
			sorted[--cntSum[nums[i]]] = nums[i];

		// 정렬된 배열 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++)
			sb.append((sorted[i] - 1000000) + "\n");
		System.out.print(sb);
	}
}
