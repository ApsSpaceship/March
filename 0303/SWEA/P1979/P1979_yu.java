package d2;

import java.util.Scanner;

public class d2_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int K = sc.nextInt();

			// N*N 배열 만들고 입력받기

			int[][] puzzle = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					puzzle[i][j] = sc.nextInt();

				}
			}

			// K칸이 비어있는지 확인하고 카운트

			int ans = 0;
			int cnt = 0;

			// 행검사
			for (int i = 0; i < N; i++) {

				cnt = 0;

				for (int j = 0; j < N; j++) {

					// 빈칸이면 카운트
					if (puzzle[i][j] == 1) {
						cnt++;
						// 검정색을 만났는데 빈칸과 수가 동일하면 정답카운트
					} else if (puzzle[i][j] == 0 && cnt == K) {
						ans++;
						cnt = 0;

						// 검정색을 만났는데 빈칸과 수가 다르면 초기화
					} else if (puzzle[i][j] == 0 && cnt != K) {
						cnt = 0;

					}

				}
				// 마지막에 1로 끝났는데 단어가 들어갈 수 있는 경우 정답카운트
				if (puzzle[i][N - 1] == 1 && cnt == K) {
					ans++;
				}
			}

			// 열검사
			for (int i = 0; i < N; i++) {

				cnt = 0;

				for (int j = 0; j < N; j++) {

					if (puzzle[j][i] == 1) {
						cnt++;
					} else if (puzzle[j][i] == 0 && cnt == K) {
						ans++;
						cnt = 0;
					} else if (puzzle[j][i] == 0 && cnt != K) {
						cnt = 0;
					}

				}
				if (puzzle[N - 1][i] == 1 && cnt == K) {
					ans++;
				}
			}

			// 출력
			System.out.println("#" + tc + " " + ans);

		} // test case end

	}

}
