import java.util.Scanner;

public class bj_2231_분해합 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int ans = 0;

		for (int i = 0; i < N; i++) {

			// 문자열로 변환

			String num = Integer.toString(i);

			// 각 자리수 배열에 넣기
			char[] n = num.toCharArray();

			int sum = i;

			// 합
			for (int j = 0; j < n.length; j++) {

				sum += (n[j] - '0');

			}

			// 조건
			if (sum == N) {

				ans = i;
				break;
			}

		}

		// 출력
		System.out.println(ans);
	}

}
