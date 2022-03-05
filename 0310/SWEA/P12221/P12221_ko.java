package Study_20220304_10;

import java.util.Scanner;

public class SWEA_12221_구구단2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A >= 10 || B >= 10) //A와 B 둘 중 하나라도 10 이상이면 -1
				System.out.println("#" + tc + " -1");
			else
				System.out.println("#" + tc + " " + (A * B));
		}
	}
}
