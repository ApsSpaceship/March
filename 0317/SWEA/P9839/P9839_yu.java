package d3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class d3_9839_최고의쌍 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			// 배열에 입력받기

			int[] set = new int[N];

			// 만족하는 쌍들 넣어줄 배열

			List<Integer> arr = new LinkedList<>();

			// 입력받은 값 넣어주기
			for (int i = 0; i < N; i++) {

				set[i] = sc.nextInt();
			}

			// 검사
			for (int i = 0; i < set.length - 1; i++) {
				for (int j = i + 1; j < set.length; j++) {

					Boolean flag = true;

					if (set[i] != set[j]) {

						int multi = set[i] * set[j];

						// 문자로 바꿔준후
						String st = Integer.toString(multi);

						// 캐릭터 배열로 바꾼후
						char[] check = st.toCharArray();

						for (int k = 0; k < check.length - 1; k++) {

							// 쌍이 아니면 멈춤
							if ((check[k] - '0') + 1 != check[k + 1] - '0') {
								flag = false;
								break;
							}

						}

						// 쌍이면 만들어 놓은 배열에 추가
						if (flag)
							arr.add(multi);

					}

				}
			}

			// 쌍이 없으면 -1 출력
			if (arr.size() == 0) {
				System.out.println("#" + tc + " " + -1);
			} else {

				// 가장 큰 숫자 출력
				Collections.sort(arr);

				int last = arr.size() - 1;

				System.out.println("#" + tc + " " + arr.get(last));

			}

		} // test case end

	}

}
