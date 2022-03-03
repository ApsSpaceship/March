package d2;

import java.util.Arrays;
import java.util.Scanner;

public class d2_1983_조교의성적매기기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 테스트케이스만큼 반복

		for (int tc = 1; tc <= T; tc++) {

			int N = sc.nextInt();

			int K = sc.nextInt();

			// 학생들 성적 담을 배열 만듦
			Double[] rank = new Double[N];

			// N명의 학생들 성적 받음

			double kscore = 0;

			for (int i = 0; i < N; i++) {

				int mid = sc.nextInt();
				int last = sc.nextInt();
				int hw = sc.nextInt();

				// 점수계산 후 배열에 넣기
				double score = (mid * 0.35) + (last * 0.45) + (hw * 0.2);

				rank[i] = score;

				if (i == K - 1) {
					kscore = score;
				}
			}
			// 정렬(오름차순)
			Arrays.sort(rank, java.util.Collections.reverseOrder());;

			// k는 몇등?
			int kidx = 0;

			for (int i = 0; i < N; i++) {
				if (rank[i] == kscore) {
					kidx = i+1;
				}
			}

			// % 구하고 성적 입력

			String ans = "";
			double krank = (kidx / (double)N) * 100;

			if (krank <= 10) {
				ans = "A+";
			} else if (krank <= 20) {
				ans = "A0";
			} else if (krank <= 30) {
				ans = "A-";
			} else if (krank <= 40) {
				ans = "B+";
			} else if (krank <= 50) {
				ans = "B0";
			} else if (krank <= 60) {
				ans = "B-";
			} else if (krank <= 70) {
				ans = "C+";
			} else if (krank <= 80) {
				ans = "C0";
			} else if (krank <= 90) {
				ans = "C-";
			} else {
				ans = "D0";
			}

			System.out.println("#" + tc + " " + ans);

		} // test case end

	}

}
