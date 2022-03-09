package d2;

import java.util.Scanner;

public class d2_1976_시각덧셈 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			// 변수 입력받음
			int hour1 = sc.nextInt();
			int minute1 = sc.nextInt();
			int hour2 = sc.nextInt();
			int minute2 = sc.nextInt();

			// 분을 먼저 계산
			int minute = minute1 + minute2;

			// 분 조건
			if (minute > 59) {
				hour1++;
				minute -= 60;
			}

			int hour = hour1 + hour2;

			// 시 조건
			if (hour > 12) {
				hour -= 12;
			}

			// 출력
			System.out.println("#" + tc + " " + hour + " " + minute);

		} // test case end
	}

}
