import java.util.Scanner;

public class bj_2292_벌집 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 최종 숫자
		int num = sc.nextInt();

		// 비교할 숫자
		int n = 1;

		// 횟수
		int cnt = 1;

		for (int i = 1; n < num; i++) {

			n = n + (6 * i); // 규칙

			cnt++;

		}

		// 출력
		System.out.println(cnt);
	}

} 
