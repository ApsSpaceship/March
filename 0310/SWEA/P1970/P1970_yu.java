package d2;

import java.util.Scanner;

public class d2_1970_쉬운거스름돈 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			int money = sc.nextInt();

			// 배열 생성

			int[] won = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

			for (int i = 0; i < won.length; i++) {
				
				// 크기가 큰 순서대로 나눠준 몫 구함

				int cnt = money / won[i];

				// 값 재조정
				money = money - (cnt * won[i]);

				// 배열에 cnt 값 입력
				won[i] = cnt;
			}

			// 출력
			System.out.println("#" + tc);
			
			for (int i = 0; i < won.length; i++) {
				System.out.print(won[i] + " ");
			}
			System.out.println();

		} // test case end
	}

}
