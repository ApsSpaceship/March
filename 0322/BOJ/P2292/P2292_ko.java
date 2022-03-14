package Study_20220318_24;

import java.util.Scanner;

public class BOJ_2292_벌집 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    //벌집은 6의 배수로 개수가 늘어난다는 규칙이 있다.  
		double N = Math.ceil((sc.nextDouble() - 1) / 6); // 1부터 시작하므로 입력 받은 값에서 -1하고 6으로 나누고 올림한다.

		int cnt = 1; //방 개수

		while (N > 0)
			N -= cnt++;

		System.out.print(cnt);
	}
}
