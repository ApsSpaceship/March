package study_0322;

import java.util.Scanner;

public class baekjoon_2292_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		num -= 1;
		while(num > 0) {
			// 방의 범위가 앞의 방에서 +6, +12, +18크기로 커진다.
			// 1, 2~7(6), 8~19(12), 20~37(18), 38~61(24)
			num = num - (6* (++count)); 
		}
		System.out.println(count+1);
	}

}
