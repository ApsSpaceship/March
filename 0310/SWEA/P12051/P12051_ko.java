package Study_20220304_10;

import java.util.Scanner;

public class SWEA_12051_프리셀통계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			long N = sc.nextLong();
			int Pd = sc.nextInt();
			int Pg = sc.nextInt();
			String ans = "Broken";
			if (!(Pg == 100 && Pd != 100 || Pg == 0 && Pd > 0)) {
				while (N > 0) {
					if ((N-- * Pd) % 100 == 0) { //반올림 값이 아니기 때문
						ans = "Possible";
						break;
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
