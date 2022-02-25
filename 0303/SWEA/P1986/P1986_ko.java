package Study_202225_0303;

import java.util.Scanner;

public class SWEA_1986_지그재그숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			if (N % 2 == 0) // 1-2 =-1, 3-4=-1 의 규칙이 있으므로
				System.out.println("#" + tc + " " + (-N / 2));
			else
				System.out.println("#" + tc + " " + (N - N / 2));
		}
	}
}
