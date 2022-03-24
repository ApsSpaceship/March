package Study_20220318_24;

import java.util.Scanner;

public class SWEA_1945_간단한소인수분해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] _abcde = { 2, 3, 5, 7, 11 }; //밑 값
		for (int tc = 1; tc <= T; tc++) {
			System.out.print("#" + tc);
			int N = sc.nextInt();
      
			for (int i = 0; i < 5; i++) {
				int abcde=0; //지수는 0으로 초기화
				while (N % _abcde[i] == 0) { //나눠떨어진다면
					abcde++; //지수 증가
					N /= _abcde[i]; //나눔
				}
				System.out.printf(" %d", abcde);
			}
      
			System.out.println();
		}
	}
}
