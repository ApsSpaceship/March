package Study_202225_0303;

import java.util.Scanner;

public class SWEA_11285_다트게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int score = 0;
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				double d = Math.sqrt(x * x + y * y); // 중심과의 거리 구하기
				int ans = (int) d / 20; // 반지름이 20 * (11 - p)인 경우 p점 획득, ans는 11-p
				if (d % 20 > 0 || ans == 0) // d가 20으로 정확히 나눠지지 않은 경우, 중앙을 맞힌 경우
					ans++;
				if (ans > 10) // 반지름 200인 원 바깥에 떨어지면 점수 없음
					ans = 11;
				score += 11 - ans;
			}
			System.out.printf("#%d %d\n", tc, score);
		}
	}
}
