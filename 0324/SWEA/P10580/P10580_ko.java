package Study_20220318_24;

import java.util.Scanner;

public class SWEA_10580_전봇대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();// 입력 받을 선 개수
			int[][] lines = new int[N][2];
			int sum = 0;
			
			for (int i = 0; i < N; i++) {
				lines[i][0] = sc.nextInt();
				lines[i][1] = sc.nextInt();

				for (int j = 0; j < i; j++) //한 점은 더 낮고 한 점은 더 높은게 있다면 세기
					if (lines[i][0] > lines[j][0] && lines[i][1] < lines[j][1] || lines[i][0] < lines[j][0] && lines[i][1] > lines[j][1])
						sum++;
			}
			
			System.out.println("#" + tc + " " + sum);
		}
	}
}
