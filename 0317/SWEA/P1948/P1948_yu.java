package d2;

import java.util.Scanner;

public class d2_1948_날짜계산기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 변수들 입력받기
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();

			int month2 = sc.nextInt();
			int day2 = sc.nextInt();

			// 일 배열
			int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			// 날짜세줄 변수
			int cnt = 0;

			// 월이 같을 경우
			if (month1 == month2) {

				cnt = day2 - day1 + 1;

			} else {
				// 월이 다를 경우

				// 해당 월의 날짜
				cnt += (date[month1] - day1 + 1) + day2;
				
				// 사이에 있는 달의 날짜

				for (int i = month1 + 1; i < month2; i++) {

					cnt += date[i];
				}

			}

			// 출력
			System.out.println("#" + tc + " " + cnt);

		} // test case end

	}

}
