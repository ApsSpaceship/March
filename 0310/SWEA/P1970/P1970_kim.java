package study_0310;

import java.util.Scanner;

public class SWEA_1970_쉬운거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int tn = 1; tn <= tc; tn++) {
			int price = sc.nextInt();
			int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int count = 0;
			System.out.println("#"+tn);
			while(count != 8) {
				for(int i = 0; i < money.length; i++) {
					int a = price / money[i];
					System.out.print(a+" ");
					price -= a*money[i];
					count++;				
				}
			}
			System.out.println();
		}
	}

}
