package study_0303;

import java.util.Scanner;

public class SWEA_1986_지그재그숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int sum = 0;
			//홀수는 더하고 짝수는 빼야 함
			for(int i = 1; i <=n; i++) {
				if(i % 2 == 1) {
					sum += i;
				}else {
					sum -= i;
				}
			}
			System.out.println("#"+tn+" "+sum);		
		}
		
	}

}
