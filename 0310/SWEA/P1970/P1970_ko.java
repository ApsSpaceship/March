package Study_20220304_10;

import java.util.Scanner;

public class SWEA_1970_쉬운거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc);
			int N = sc.nextInt();
			for (int i = 0; i < 8; i++) {
				System.out.print(N / money[i] + " "); // 몫 출력
				N %= money[i]; // 나머지 저장
			}
			System.out.println();
		}

	}

}
