package Study_20220311_17;

import java.util.Scanner;
import java.util.TreeSet;

public class SWEA_9839_최고의쌍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] nums = new int[N];
			TreeSet<Integer> ansSet = new TreeSet<>(); // 정렬, 중복 제거하는 정답 셋
			for (int i = 0; i < N; i++)
				nums[i] = sc.nextInt();

			for (int i = N - 1; i >= 0; i--)
				for (int j = i - 1; j >= 0; j--) {
					boolean flag = true;
					String sub = String.valueOf(nums[i] * nums[j]);
					for (int k = 0; k < sub.length() - 1; k++) // 증가하는 연속적인 수인지 확인
						if (Integer.valueOf(sub.charAt(k)) + 1 != Integer.valueOf(sub.charAt(k + 1))) {
							flag = false;
							break;
						}

					if (flag) // 증가하는 연속적인 수라면 정답 셋에 추가
						ansSet.add(nums[i] * nums[j]);
				}

			System.out.printf("#%d ", tc);
			if (ansSet.isEmpty()) // 정답 셋이 비었으면 -1 출력
				System.out.println(-1);
			else // 가장 큰 값 출력
				System.out.println(ansSet.last());
		}
	}

}
