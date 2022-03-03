package study_0303;

import java.util.Scanner;

public class SWEA_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt(); // 퍼즐의 크기
			int k = sc.nextInt(); // 글자 수
			int[][] arr = new int[n][n];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			//가로방향 탐색
			for(int i = 0; i < arr.length; i++) {
				int count = 0;
				for(int j = 0; j < arr.length; j++) {
					if(arr[i][j] == 1) count++;	//1일때 단어가 들어갈 수 있는 공간			
					else {
						if(count == k) sum++;
						count = 0;					
					}
				}
				if(count == k)sum++;
			}
			//세로방향 탐색
			for(int i = 0; i < arr.length; i++) {
				int count = 0;
				for(int j = 0; j < arr.length; j++) {
					if(arr[j][i] == 1) count++;						
					else {
						if(count == k) sum++;
						count = 0;					
					}				
				}
				if(count == k) sum++;
			}
			System.out.println("#"+tn+" "+sum);
		}
	}

}
