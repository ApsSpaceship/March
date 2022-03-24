package study_0322;

import java.util.Scanner;

public class baekjoon_2775_부녀회장이될테야 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int k = sc.nextInt(); // 층
			int n = sc.nextInt(); // 호
			int sum = 0;
			int[][] num = new int[k+1][n+1];
			// 0층 값 입력하기!
			for(int i = 1; i < n+1; i++) {
				num[0][i] = i;
			}
			// 아래층 1호부터 내 호수까지 더하기!
			for(int i = 1; i < num.length; i++) {
				for(int j = 1; j < n+1; j++) {				
					for(int l = 1; l <= j; l++) {
						num[i][j] += num[i-1][l];
					}
				}
			}
			
			System.out.println(num[k][n]);
		}
	}

}
