import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 1; i < n; ++i) {
			int sum = 0;
			int num = i;

			// 수 더하기
			sum += num;

			// 각 자리수 더하기
			while (num != 0) {
				sum += (num % 10);
				num /= 10;
			}

			// 분해합이 n이면 탈출
			if (sum == n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
