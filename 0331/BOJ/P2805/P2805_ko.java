import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2805_나무자르기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] tree = new long[n];
		for (int i = 0; i < n; i++) // 나무 길이 입력
			tree[i] = sc.nextLong();

		Arrays.sort(tree); // 정렬

		System.out.print(solve(0, tree[n - 1], n, m, tree));
	}

	static long solve(long left, long right, int n, long m, long[] tree) { // 이진 탐색
		while (true) {
			long mid = (left + right) / 2;
			long len = 0;
			for (int i = 0; i < n; i++) // 나무 댕강
				if (tree[i] >= mid)
					len += (tree[i] - mid);

			if (len < m) // 자른 나무 부족하면 높이 낮추기
				right = mid - 1;
			else { // 자른 나무가 목표치 이상이면
				if (left >= right) { // 답을 찾았거나
					return mid;
				}
				left = mid + 1; // 높이 높이기
			}
		}
	}
}
