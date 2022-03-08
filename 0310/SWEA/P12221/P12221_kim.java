package study_0310;

import java.util.Scanner;

public class SWEA_12221_구구단2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int ans = -1;
			if(num1 <= 9 && num2 <= 9) { // 두 수 모두 9 이하일때만 곱한 값 출력
				ans = num1 * num2;
			}
			System.out.println("#"+tn+" "+ans);
		}
	}

}
