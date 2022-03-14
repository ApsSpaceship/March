package Study_20220318_24;

import java.util.Scanner;

public class BOJ_2609_최대공약수와최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 최대공약수(유클리드 호제법)
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		while (max % min != 0) {
			int tmp = max;
			max = min;
			min = tmp % min;
		}
		
		System.out.println(min);
		System.out.print(a * b / min);//최소공배수
	}
}
