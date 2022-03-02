package com.ssafy.swea;

import java.util.Scanner;

public class P1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		for(int tc =1 ; tc<= T; tc++) {
            // 입력할 숫자
			int N = sc.nextInt();
            // 숫자 연산 결과
			int ans = 0;
			for(int i = 1; i<=N; i++) {
                // 홀수면 +
				if(i %2 == 1) ans += i;
                //짝수면 -
				else ans -= i;
			}
			System.out.println("#"+tc+ " "+ ans);
		}
		sc.close();
	}
}
