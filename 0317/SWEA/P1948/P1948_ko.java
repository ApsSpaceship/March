package Study_20220311_17;

import java.util.Scanner;

public class SWEA_1948_날짜계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int month1 = sc.nextInt();
			int day1 = sc.nextInt();
			int month2 = sc.nextInt();
			int ans = sc.nextInt(); // ans는 두 번째 일로 초기화

			for (int i = month1; i < month2; i++) { //첫달부터 마지막 달 전까지 일 합
				ans += date(i);
			}
			ans -= day1 - 1; //첫날 포함이므로 첫 번째 일 -1한 값 빼기
      
			System.out.println("#" + tc + " " + ans);
		}
	}

	public static int date(int n) {
		int ans = 0;
		String p31 = "135781012";
		if (n == 2)
			ans += 28;
		else if (p31.contains(Integer.toString(n))) {
			ans += 31;
		} else
			ans += 30;
		return ans;
	}

}
