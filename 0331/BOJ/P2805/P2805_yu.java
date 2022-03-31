import java.util.Arrays;
import java.util.Scanner;

public class bj_2805_나무자르기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int line = sc.nextInt();

		int need = sc.nextInt();

		int[] tree = new int[line];

		Arrays.sort(tree);

		int left = 0;

		int right = -1;

		for (int i = 0; i < line; i++) {

			tree[i] = sc.nextInt();

			right = Math.max(right, tree[i]);
		}

		while (left <= right) {

			int mid = (left + right) / 2;

			long sum = 0;

			for (int i = 0; i < line; i++) {

				if (tree[i] > mid)
					sum += tree[i] - mid;

			}

			if (sum >= need)
				left = mid + 1;
			else 
				right = mid - 1;

		}
		
		System.out.println(right);

	}// main

}
