package study_0303;

import java.util.Scanner;

public class SWEA_1983_조교의성적매기기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int student = sc.nextInt(); // 학생수
			int check = sc.nextInt(); // 몇번째 학생
			double[] score = new double[student];
			int mid = 0; // 중간고사 점수
			int fin = 0; // 기말점수
			int hw = 0; // 과제점수
			for(int i = 0; i < score.length; i++) {
				mid = sc.nextInt();
				fin = sc.nextInt();
				hw = sc.nextInt();
				score[i] = mid*0.35+fin*0.45+hw*0.2;
			}
			String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
			float count = 0;
			for(int i = 0; i < score.length; i++) {
				if(score[i] > score[check-1]) {
					count++; // 몇 번 뒤로 밀리는지 체크
				}
			}
			//count/student*10 -> 10의 배수로 학생이 들어와서
			System.out.println("#"+tn+" "+grade[(int) (count/student*10)]);
		}
	}

}
