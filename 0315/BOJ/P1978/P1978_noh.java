import java.util.Scanner;

public class Main {
	static final int N = 1000;
	static boolean notPrime[] = new boolean[N + 1];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 에라토스테네스 전처리
		notPrime[1] = true;
		for (int i = 2; i <= N / 2; ++i)
			if (!notPrime[i])
				for (int j = 2 * i; j <= N; j += i)
					notPrime[j] = true;

		// 입력받고 출력
		int ans = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; ++i)
			if (!notPrime[sc.nextInt()])
				++ans;
		System.out.println(ans);
	}
}
