package Study_202225_0303;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1983_조교의성적매기기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] score = { "D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
    
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 학생 수
			int K = sc.nextInt(); // 알고 싶은 번호
			int[] sum = new int[N];
			int sumK = 0;
			for (int i = 0; i < N; i++) {
				sum[i] = sc.nextInt() * 35 + sc.nextInt() * 45 + sc.nextInt() * 20;
				if (i + 1 == K) //K번째 학생 점수는 저장
					sumK = sum[i];
			}
      
			Arrays.sort(sum); //정렬
			String ans = "";
			for (int i = 0; i < N; i++) {
				if (sum[i] == sumK) { //K번째 학생의 점수 위치는 i번째
					ans = score[i * 10 / N];
					break;
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
