package study_0322;

import java.util.Scanner;

public class baekjoon_2609_최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > num2) {
			int n = num1;
			num1 = num2;
			num2 = n;
		}
		int max = 0; // 최대공약수 구할 변수
		for(int i = 1; i <= num1; i++) {
			if((num1 % i == 0) && ( num2 % i == 0)) {
				max = Math.max(max, i);
			}
		}
		int min = max * (num1 / max) * (num2 / max); // 최소공배수
		
		System.out.println(max);
		System.out.println(min);
	}

}
