package study_0324;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class swea_13038_교환학생 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int[] day = new int[7];
			for(int i = 0; i < 7; i++) {
				day[i] = sc.nextInt();
			}
			int ans = Integer.MAX_VALUE;
			for(int i = 0 ; i < 7; i++) {
				if(day[i] == 0) {
					continue;
				}else {
					int st = i; // 등교 시작 요일
					int check = 0; // 보충 횟수
					int count = 0; // 등교 일수
					while(true) {
						if(day[st%7] == 1) {
							check++;
						}
						count++;
						st++;
						if(check == n) {
							break;
						}
					}
					ans= Math.min(ans, count);					
				}
			}
			System.out.println("#"+tn+" "+ans);		
		}
	}
}
