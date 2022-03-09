package d3;

import java.util.HashSet;
import java.util.Scanner;

public class d3_12004_구구단1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 해쉬셋

		HashSet<Integer> set = new HashSet<>();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				set.add(i * j);
			}
		}

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			String ans = "No";

			int num = sc.nextInt();

			// 포함되어있으면 곱으로 표현 가능
			if (set.contains(num) == true) {

				ans = "Yes";
			}

			System.out.println("#" + tc + " " + ans);

		} // testcase end

	}

}
