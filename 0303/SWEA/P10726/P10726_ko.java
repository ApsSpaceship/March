package Study_202225_0303;

import java.util.Scanner;

public class SWEA_10726_이진수표현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int sub = 1;
			String ans = "OFF";
			for (int i = 0; i < N; i++) { // N의 자리까지 1켜져 있는 값 이상인지 확인
				M -= sub;
				sub *= 2;
			}
			if (M >= 0 && M % sub == 0) { // 그 값 이상이면서 남은 값이 sub로 나눠떨어지면
				ans = "ON";
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
