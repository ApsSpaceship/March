package d2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class d2_1946_간단한압축풀기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// 문자 K개
			int K = sc.nextInt();

			// 배열생성

			List<String> output = new LinkedList<String>();

			// 입력받으면서 배열에 넣기
			for (int i = 0; i < K; i++) {

				String alp = sc.next(); // 문자

				int num = sc.nextInt(); // 문자 개수

				for (int j = 0; j < num; j++) {

					output.add(alp);
				}

			}

			// 출력

			System.out.println("#" + tc + " ");

			for (int i = 1; i <= output.size(); i++) {

				System.out.print(output.get(i - 1));

				// 한줄에 열글자씩 출력

				if (i % 10 == 0) {
					System.out.println();
				}
			}
			System.out.println();

		} // test case end

	}

}
