import java.util.Arrays;
import java.util.Scanner;

public class bj_1920_수찾기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] Narr = new int[N];

		for (int i = 0; i < N; i++) {

			Narr[i] = sc.nextInt();

		}

		Arrays.sort(Narr);

		// 같은값이 있는지 확인해야 하는 수들
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {

			int num = sc.nextInt();

			if (Arrays.binarySearch(Narr, num) >= 0) {

				System.out.println(1);

			}

			else
				System.out.println(0);

		}

	}

}
