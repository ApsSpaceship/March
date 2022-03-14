
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 배열생성

		int[] prime = new int[N];

		int max = 0;

		for (int tc = 0; tc < N; tc++) {

			prime[tc] = sc.nextInt();

			if (prime[tc] >= max)
				max = prime[tc];
		}

		// 소수 판별을 위한 배열 생성

		int[] check = new int[max + 1];

		for (int i = 0; i < check.length; i++) {

			check[i] = i;
		}

		check[1] = 0;

		// 소수가 아니면 제외

		for (int i = 2; i * i < max + 1; i++) {

			// check[i]가 소수이면
			if (check[i] != 0) {

				// 소수 아님
				for (int j = i * i; j < max + 1; j += i) {

					check[j] = 0;

				}
			}

		}

		// 개수
		int cnt = 0;

		for (int i = 0; i < N; i++) {

			if (check[prime[i]] != 0)
				cnt++;
		}

		System.out.println(cnt);

	}

}
