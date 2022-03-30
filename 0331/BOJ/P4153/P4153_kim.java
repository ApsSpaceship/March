package study_0329;

import java.util.Scanner;

public class baekjoon_P4153_직각삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			String ans = "wrong";
			int max = 0;
			// 세 수 비교해서 최댓값 찾기
			max = Math.max(a, b);
			max = Math.max(max, c);
			// 최댓값이 어떤 값인지에 따라 피타고라스 확인
			if (max == a) {
				ans = check(max, b, c);
			} else if (max == b) {				
				ans = check(max, a, c);
			} else {				
				ans = check(max, a, b);
			}
			System.out.println(ans);
		}
	}

	static String check(int num1, int num2, int num3) {
		if (num1 == (int) Math.sqrt(Math.pow(num2, 2) + Math.pow(num3, 2))) {
			return "right";
		}
		return "wrong";
	}
}
