import java.util.Scanner;

public class bj_2751_수정렬하기2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		int max = -1;

		// 배열에 넣기
		for (int i = 0; i < N; i++) {

			arr[i] = sc.nextInt() + 1000000; // 음수 고려
			if (max < arr[i])
				max = arr[i]; // 최댓값찾기

		}

		int[] count = new int[max + 1]; // 카운팅배열

		int[] sorted = new int[N]; // 정렬된 배열

		// 카운팅배열에 넣기
		for (int i = 0; i < N; i++) {

			count[arr[i]]++;
		}

		// 누적합
		for (int i = 1; i < count.length; i++) {

			count[i] += count[i - 1];
		}

		// 정렬
		for (int i = N - 1; i >= 0; i--) {

			sorted[--count[arr[i]]] = arr[i];

		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			
			sb.append((sorted[i] - 1000000) + "\n");
		}
		
		System.out.print(sb);

	}
}
