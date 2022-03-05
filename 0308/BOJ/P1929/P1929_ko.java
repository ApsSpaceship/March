package Study_20220304_10;

import java.util.Scanner;

public class BOJ_1929_소수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
    
		if (M == 1) // 1은 소수가 아니므로
			M++;
    
		for (int i = M; i <= N; i++) {
			boolean flag = true;
			for (int j = 2; j * j <= i; j++) { // 루트 i까지 비교
				if (i % j == 0) { // 나눠지는 값이 있다면 소수 아님
					flag = false;
					break;
				}
			}
			if (flag) // 소수라면
				System.out.println(i);
		}
	}
}
