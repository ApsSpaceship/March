package study_0324;

import java.util.Scanner;

public class swea_1945_간단한소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int n = sc.nextInt();
			int[] num = {2, 3, 5, 7, 11};
			System.out.print("#"+tn);
			for(int i = 0; i < num.length; i++) {
				int count = 0;
				while(true && n > 0 ) {
					// 나누어 떨어지면 나누고 count함!!
					if(n % num[i] == 0) {
						n = n / num[i];
						count++;
					}else {
						break;
					}
				}
				System.out.print(" "+count);
			}
			System.out.println();
		}
	}

}
