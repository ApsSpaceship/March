package study_0324;

import java.util.Scanner;

public class swea_10580_전봇대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][2];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < 2; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			for(int i = 0; i < arr.length-1; i++) {
				for(int j = i+1; j < arr.length; j++) {
					//두 줄이 겹치려면 s1 > s2 && e1 < e2  또는 s1 < s2 && e1 > e2 
					if((arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1]) ||
							(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1])) {
						count++;
					}
				}
			}
			System.out.println("#"+tn+" "+count);
		}
	}

}
