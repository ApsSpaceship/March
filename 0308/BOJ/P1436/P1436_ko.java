package Study_20220304_10;

import java.util.Scanner;

public class BOJ_1436_영화감독숌 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int cnt = 1;
		while (cnt < N) {
			num++;
			if (Integer.toString(num).contains("666"))
				cnt++;
		}
		System.out.print(num);
	}
}
