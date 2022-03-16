package d3;

import java.util.Arrays;
import java.util.Scanner;

public class d3_11856_반반 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			
			// 입력받기
			
			char[] alp = sc.next().toCharArray();

			int cnt = 0;

			// 배열돌면서 같으면 cnt 늘리기
			for (int i = 0; i < 3; i++) {

				for (int j = i+1; j < 4; j++) {

					if (alp[i]== alp[j])
						cnt++;

				}

			}

			// 출력
			if (cnt == 2) {

				System.out.println("#" + tc + " " + "Yes");
			} else {
				System.out.println("#" + tc + " " + "No");

			}

		} // test case end

	}
}
