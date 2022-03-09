package Study_20220311_17;

import java.util.Scanner;

public class BOJ_1978_소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력 받을 숫자 개수
		int cnt = 0; // 소수 개수
		
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num == 1) // 1은 소수 아님
				continue;

			int j = 2; // j를 나중에도 사용하기 위해 밖에서 초기화
			for (; j * j <= num && num % j != 0; j++) { // num의 제곱근까지 비교
			}

			if (j * j > num) // 반복문을 끝까지 다 돌았다면 소수임
				cnt++;
		}

		System.out.print(cnt);
	}
}
