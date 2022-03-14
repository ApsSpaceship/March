import java.util.Arrays;
import java.util.Scanner;

public class bj_2108_통계학 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 배열 생성

		int[] arr = new int[N];

		// 최빈값을 위한 배열생성

		int[] marr = new int[8001];

		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt();

			if (arr[i] > 0) {

				marr[4000 + arr[i]]++;
			} else {

				marr[4000 - Math.abs(arr[i])]++;
			}
		}

		// 배열 정렬

		Arrays.sort(arr);

		// 산술평균

		int sum = 0;

		for (int i = 0; i < N; i++) {

			sum += arr[i];
		}

		long avg = Math.round((double) sum / N);

		System.out.println(avg);

		// 중앙값
		int mid = arr[N / 2];

		System.out.println(mid);

		// 최빈값 (단, 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력)

		int max = 0;

		for (int i = 0; i < marr.length; i++) {

			if (marr[i] > max) {
				max = marr[i];
			}

		}

		// 여러개 있을 때 고려

		int cnt = 0;
		int mode = 0;

		for (int i = 0; i < marr.length; i++) {

			if (marr[i] == max) {

				mode = i;
				cnt++;
			}

			if (cnt == 2) {
				break;
			}
		}

		if (mode < 4001) {

			mode -= 4000;
		} else {
			mode -= 4000;
		}

		System.out.println(mode);

		// 범위
		int range = arr[N - 1] - arr[0];

		System.out.println(range);

	}
}
