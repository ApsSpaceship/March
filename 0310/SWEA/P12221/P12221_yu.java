package d3;

import java.util.Scanner;

public class d3_12221_구구단2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			int a = sc.nextInt();

			int b = sc.nextInt();

			int ans;

			if (a > 9 || b > 9) {

				ans = -1;
			} else {
				ans = a * b;
			}

			System.out.println("#" + tc + " " + ans);

		}

	}

}
