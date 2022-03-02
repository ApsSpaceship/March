package com.ssafy.swea;

import java.util.Arrays;
import java.util.Scanner;

public class P1983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 개수
		int T = sc.nextInt();
		// 반복 : 테스트 케이스 수 만큼
		for(int tc =1; tc<=T; tc++) {
			// 학생수
			int N = sc.nextInt();
			// 알고자 하는 K번째 학생
			int K = sc.nextInt();
			// 학생 번호 부여 (1번부터)
			// 학생 점수 배열
			float scoK = 0;
			// 정렬할 평균 배열
			float[] avg = new float[N+1];
			// 반복 : 학생수 만큼
			for(int i = 1; i <= N; i++) {
				avg[i] = sc.nextFloat() /100 * 35 + sc.nextFloat() /100 * 45 +sc.nextFloat() /100 * 20;
				// K번째 학생점수 
				if(i == K) scoK = avg[i];
			}
			// 점수 오름차순 나열
			Arrays.sort(avg);
			// 학점 배열
			String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
			// 학점 커트라인 배열
			float[] cutline =  new float[10];
			// 앞에서에서부터 N/10 개수만큼 잘라서 각 학점 커트라인을 학점 배열에 저장 
			int idx = 0;
			int stuNum = 1;
			while(idx <= 10 && stuNum <= N) {
				cutline[idx] = avg[stuNum];
				idx++;
				stuNum += N/10;
			}
			// 커트라인 배열 거꾸로 순회
			// K번째 학생의 점수와 학점 별 커트라인 비교
			// 정답 도출
			for(int i = 9; i>=0; i--) {
				if(cutline[i] <= scoK) {
					System.out.println("#"+tc+" "+score[9-i]);
					break;
				}
			}
		}
		sc.close();
	}
}
