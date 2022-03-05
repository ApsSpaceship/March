package Study_20220304_10;

import java.util.Scanner;

public class SWEA_12004_구구단1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String ans = "No";//No로 초기화
      
			if (N <= 81) { //81이 최대
				point: for (int i = 1; i < 10; i++) {
					for (int j = 1; j < 10; j++) {
						if (i * j == N) { //두 수를 곱해서 나타낼 수 있다면
							ans = "Yes";
							break point;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		}

	}
}
