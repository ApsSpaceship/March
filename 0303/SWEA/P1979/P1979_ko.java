package Study_202225_0303;

import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dx = { 1, 0 }; // 하우
		int[] dy = { 0, 1 };
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int count = 0;
			int x = 0;
			int y = 0;
			int[][] vMap = new int[N][N];
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					vMap[i][j] = sc.nextInt();

			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					for (int d = 0; d < 2; d++) { // 하 우
						int pluse = 0;
						do {
							x = i + dx[d] * pluse;
							y = j + dy[d] * pluse++;
						} while (x >= 0 && x < N && y >= 0 && y < N && vMap[x][y] == 1); // 맵 안에 있으면서 값이 1이면
						x = i - dx[d]; // 전 값
						y = j - dy[d];
						if (!(x >= 0 && x < N && y >= 0 && y < N && vMap[x][y] == 1) && pluse - 1 == K) // 전 값이 1이 아니면서
																										// 개수가 같으면
							count++;
					}

			System.out.println("#" + tc + " " + count);
		}
	}
}
