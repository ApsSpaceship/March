package study_0308;

import java.util.Scanner;

public class baekjoon_1436_영화감독숌 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
	    int a = 666; // 시작점
		while(count<n) {
			a++;
			if(Integer.toString(a).contains("666")) {
				count++;
			}
		}System.out.println(a);
	}

}
