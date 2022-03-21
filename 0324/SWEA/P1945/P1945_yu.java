package d2;

import java.util.Scanner;

public class d2_1945_소인수분해 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int a = func(N, 2);
			N = n(N, 2);

			int b = func(N, 3);
			N = n(N, 3);

			int c = func(N, 5);
			N = n(N, 5);

			int d = func(N, 7);
			N = n(N, 7);

			int e = func(N, 11);

			System.out.printf("#%d %d %d %d %d %d", tc, a, b, c, d, e);
			System.out.println();

		}

	}

	// 지수 구하는 함수
	public static int func(int N, int num) {

		int a = 0;

		while (true) {

			if (N % num == 0) {
				a++;
				N /= num;
			} else {
				break;
			}

		}
		return a;

	}

	// 변화된 N 구하는 함수
	public static int n(int N, int num) {

		int a = 0;

		while (true) {

			if (N % num == 0) {
				a++;
				N /= num;
			} else {
				break;
			}

		}
		return N;

	}

}
