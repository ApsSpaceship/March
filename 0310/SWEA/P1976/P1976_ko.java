package Study_20220304_10;

import java.util.Scanner;

public class SWEA_1976_시각덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int hour;
		int min;
		for (int tc = 1; tc <= T; tc++) {
			hour = 0;
			min = 0;
			for (int i = 0; i < 2; i++) {
				hour += sc.nextInt();
				min += sc.nextInt();
			}
			hour = (hour + min / 60) % 12;
			min %= 60;
			if (hour == 0) //12시
				hour = 12;
			System.out.printf("#%d %d %d\n", tc, hour, min);
		}
	}

}
