package study_0310;

import java.util.Scanner;

public class SWEA__1976_시각덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int sumh = 0;
			int summ = 0;
			summ = m1 + m2;
			sumh = h1 + h2;
			if(summ >= 60) { // 분 합이 60이 넘으면 시에 +1, 분은 -60
				sumh++;
				summ -= 60;
			}
			if(sumh > 12) { // 시 합이 12 초과하면 시에 -12
				sumh-=12;
			}
			
			System.out.println("#"+tn+" "+sumh+" "+summ);
			
		}
	}

}
