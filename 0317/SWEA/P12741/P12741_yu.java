package d3;

import java.util.Scanner;

public class d3_12741_두전구 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			// 배열생성
			int[] light = new int[101];

			int xs = sc.nextInt();
			int xd = sc.nextInt();
			int ys = sc.nextInt();
			int yd = sc.nextInt();

			// 시작부터 끝까지 해당하는 부분 카운팅
			for (int i = xs; i <= xd; i++) {

				light[i]++;
			}

			for (int i = ys; i <= yd; i++) {

				light[i]++;
			}

			int cnt = 0;

			// 두 전구다 해당하면 해당 값이 2가 됨
			for (int i = 0; i < light.length; i++) {

				if (light[i] == 2)
					cnt++;
			}

			if (cnt == 0) {
				System.out.println("#" + tc + " " + cnt);
			} else {
				System.out.println("#" + tc + " " + (cnt - 1));
			}
		}

	}

}
