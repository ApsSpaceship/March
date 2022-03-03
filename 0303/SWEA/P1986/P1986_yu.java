package d2;

import java.util.Scanner;

public class d2_1986_지그재그숫자 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복
		for (int tc = 1; tc <= T; tc++) {

			// 입력받기
			int num = sc.nextInt();

			// 누적이니까 계산해줄 변수 생성
			int sum = 0;

			// 1부터 num까지

			for (int n = 0; n < num; n++) {

				int[] nums = new int[num];

				nums[n] = n + 1;

				// 홀수면 더하고(원래 상태) 짝수면 빼자
				if (nums[n] % 2 == 0) {
					sum -= nums[n];
				} else {

					// 누적해서 더해주기
					sum += nums[n];
				}
			}

			// 출력

			System.out.printf("#%d %d\n", tc, sum);

		}
	}
}
