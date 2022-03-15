import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;
		int med = 4001;
		int cnt[] = new int[8001];
		int maxCnt = 0;
		int minV = 4000;
		int maxV = -4000;

		for (int i = 0; i < n; ++i) {
			int num = sc.nextInt();

			// 합
			sum += num;

			// 카운트
			++cnt[num + 4000];
			maxCnt = Math.max(maxCnt, cnt[num + 4000]);

			// 최소, 최대
			minV = Math.min(minV, num);
			maxV = Math.max(maxV, num);
		}

		// 평균 구하기
		int avg = (sum >= 0 ? (int) ((double) sum / n + 0.5) : (int) ((double) sum / n - 0.5));

		// 중앙값 구하기
		int cntM = 0;
		for (int i = 0; i <= 8000; ++i) {
			cntM += cnt[i];
			if (cntM >= (n + 1) / 2) {
				med = i - 4000;
				break;
			}
		}

		// 최빈값 구하기
		int flag = 0;
		int mode = 4001;
		for (int i = 0; i <= 8000; ++i)
			if (cnt[i] == maxCnt) {
				mode = i - 4000;
				++flag;
				if (flag == 2)
					break;
			}

		// 출력
		System.out.println(avg);
		System.out.println(med);
		System.out.println(mode);
		System.out.println(maxV - minV);
	}
}
