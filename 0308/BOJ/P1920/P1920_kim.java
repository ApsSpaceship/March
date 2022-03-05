package study_0308;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_1920_수찾기 {
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 배열 정렬 후 이진탐색 이용
		int check = sc.nextInt();
		for (int i = 0; i < check; i++) {
			System.out.println(checked(sc.nextInt()));
		}

	}
 
	public static int checked(int key) {
		int st = 0;
		int ed = arr.length - 1;
		while (st <= ed) {
			int mid = (st + ed) / 2;
			if (key == arr[mid]) {
				return 1; // 찾으면 1 반환해서 출력
			} else if (key < arr[mid]) {
				ed = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return 0; // 못찾으면 0 반환해서 출력
	}
}
