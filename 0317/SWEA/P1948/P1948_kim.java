package study_0317;

import java.util.Scanner;

public class swea_1948_날짜계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int tn = 1; tn <= tc; tn++) {
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			int sum = 0;
			for(int i = m1; i < m2; i++) {
				sum+=month[i];
			}
			sum += (d2-d1+1); // 시작 날짜를 포함하고 세야해서 +1 해주었다.
			
			System.out.println("#"+tn+" "+sum);
		}
	}

}
